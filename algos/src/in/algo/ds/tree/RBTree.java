package in.algo.ds.tree;



/**
 * Left Leaning Red Black Tree
 * @author nishant.awasthi1
 *
 */
public class RBTree<Key extends Comparable<Key>,Value> {
	Node root;
	
	private boolean RED=true;
	private boolean BLACK=false;
	
	class Node{
		Node leftNode;
		Node rightNode;
		Key key;
		Value val;
		int size;
		private boolean color; 	
		public Node(Key key, Value val, int size,boolean color) {
			super();
			this.key = key;
			this.val = val;
			this.color = color;
			this.size = size;
		}
		
	}

	/**
	 * 
	 */
	public RBTree() {
		// TODO Auto-generated constructor stub
	}
	
	public Value  get(Key key){
		return get(key,root);
	}
	
	private Value get(Key key, Node node) {
		return null;
		
		
	}

	public void put(Key key,Value val){
		root=put(key,val,root);
	}

	private Node put(Key key, Value val, Node node) {
		if(node==null) return new Node(key, val, 1, RED);
		int compare=key.compareTo(node.key);
		if(compare==0){
			node.val=val;
		}else if(compare>0){
			node.rightNode=put(key, val, node.rightNode);
		}else{
			node.leftNode=put(key, val, node.leftNode);
		}
		//if node right child is red, rotate left
		if(node.rightNode.color && ! node.leftNode.color) node=rotateLeft(node);
		// if node left and left's left is red, then rotate right
		if(node.leftNode.color && node.leftNode.leftNode.color) node=rotateRight(node);
		//if both left and right red, flip colors
		if(node.leftNode.color && node.rightNode.color) node=flipColors(node);
		return node;
	}

	private Node flipColors(Node node) {
		node.color=RED;
		node.leftNode.color=BLACK;	
		node.rightNode.color=BLACK;	
		return node;
	}
	
	/**
	 * 
	 *   n
	 *  / \
	 *  B  R
	 *  /\ /\
	 *     m
	 * 
	 *      |
	 *      |
	 *    \  /
	 *     \/
	 *     
	 *    R
	 *   / \
	 *   n  
	 *   /\
	 *  B  m
	 *  /\
	 * @param node
	 * @return
	 */
	private Node rotateLeft(Node node) {
		Node x=node.rightNode;
		node.rightNode=x.leftNode;
		x.leftNode=node;
		x.color=node.color;
		node.color=RED;
		x.size=node.size;
		node.size=size(node.rightNode)+size(node.leftNode)+1;
		return x;
	}
	/**
	 *     		N
	 *     	   / \
	 *     	  R1
	 *        /\
	 *       R2 
	 *       /\
	 *       
	 *       
	 * @param node
	 * @return
	 */
	private Node rotateRight(Node node) {
		Node x=node.leftNode;
		node.leftNode=x.rightNode;
		x.rightNode=node;
		x.color=node.color;
		node.color=RED;
		x.size=node.size;
		node.size=size(node.rightNode)+size(node.leftNode)+1;
		return x;
	}
	
	private int size(Node x) {
        if (x == null) return 0;
        return x.size;
    }
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
