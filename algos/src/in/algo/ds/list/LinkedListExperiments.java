/**
 * 
 */
package in.algo.ds.list;

import java.util.LinkedList;

/**
 * @author Nishant
 *
 */
public class LinkedListExperiments {

	/**
	 * 
	 */
	public LinkedListExperiments() {

	}
	
	public class LinkList<E>{
		
		private class Node<E>{
			E data;
			Node<E> next;
			public Node(E data){
				this.data=data;
			}
		}
		
		Node<E> root;
		
		public void add(E data){
			Node<E> node=new Node<E>(data);
			if(root!=null){
				Node<E> lnode=getLastNode(root);
				lnode.next=node;
			}else{
				root=node;
			}
		}
		
		private Node<E> getLastNode(Node<E> node) {
			if(node.next!=null){
				return getLastNode(node.next);
			}
			return node;
		}
		
		public void print(){
			print(root);
		}
		
		private void print(Node<E> node) {
			if(node!=null){
				System.out.println(node.data);
				if(node.next!=null){
					print(node.next);
				}
			}
		}

		public void reverse() {
			reverse(root,null);
		}

		private void reverse(Node<E> current,Node<E> prev) {
			if(current.next==null){
				root=current;
			}else{
				reverse(current.next,current);
			}
			current.next=prev;
		}

	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListExperiments exp=new LinkedListExperiments();
		LinkList<Integer> list=exp.new LinkList<>();
		list.add(4);
		list.add(2);
		list.add(3);
		list.print();
		System.out.println("----now reversing the list----");
		list.reverse();
		list.print();
	}

}
