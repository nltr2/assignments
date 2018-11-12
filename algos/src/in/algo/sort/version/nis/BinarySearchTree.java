/**
 * 
 */
package in.algo.sort.version.nis;

/**
 * @author nishant.awasthi1
 *
 */
public class BinarySearchTree<Key extends Comparable<Key>, Value> {
	Node root;

	class Node {
		Node leftNode;
		Node rightNode;
		Key key;
		int size;
		Value val;

		public Node(Key key, Value val) {
			this.key = key;
			this.val = val;
			this.size = 1;
		}
	}

	public void put(Key key, Value val) {
		root = put(root, key, val);
	}

	protected Node put(Node node, Key key, Value val) {
		if (node == null) {
			node = new Node(key, val);
		} else if (key.compareTo(node.key) < 0) {
			node.leftNode = put(node.leftNode, key, val);
		} else {
			node.rightNode = put(node.rightNode, key, val);
		}
		node.size = size(node.leftNode) + size(node.rightNode) + 1;
		return node;
	}

	protected int size(Node node) {
		if (node == null)
			return 0;
		return node.size;
	}
	
	public Value get(Key key){
		return get(key,root);
	}

	protected Value get(Key key, Node node) {
		if(node!=null ){
			int compare=key.compareTo(node.key);
		    if(compare==0){
		    	return node.val;
		    }else if(compare<0){
		    	return get(key, node.leftNode);
		    }else{
		    	return get(key, node.rightNode);
		    }
		}
		return null;
	}

	/**
	 * 
	 */
	public BinarySearchTree() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
