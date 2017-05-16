package com.brother.base;

/**
 * 链表实现
 * 
 * @author 18389
 *
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		NodeManager nm = new NodeManager();
		nm.add(5);
		nm.add(4);
		nm.add(3);
		nm.add(2);
		nm.add(1);
		nm.printNodes();
		System.out.println(nm.contains(11));
		nm.update(1, 10);
		nm.del(10);
		nm.insert(1, 12);
		nm.printNodes();
	}
}
/**
 * 链表管理类
 * @author 18389
 *
 */
class NodeManager {
	//链表的其实节点
	private Node root;
	private int current=0;
    //添加节点
	public void add(int data) {
		if (root == null) {
			root = new Node(data);
		} else {
			root.addNode(data);
		}
	}
	public void del(int data){
		if(root==null) return;
		if(root.data==data){
			root = root.next;
		}else{
			root.delete(data);
		}
	}
	//该元素是否在链表中
	public Boolean contains(int data){
		if(root==null) return false;
		if(root.getData()==data){
			return true;
		}else{
			return root.contains(data);
		}
	}
	public Boolean update(int oldData,int newData){
		if(root==null) return false;
		if(root.getData()==oldData){
			root.setData(newData);
			return true;
		}else{
			return root.update(oldData, newData);
		}
	}
	public void insert(int index,int data){
		if(index<0) return;
		current = 0;
		if(index==current){
			Node newNode = new Node(data);
			newNode.next = root;
			root = newNode;
		}else{
			root.insert(index, data);
		}
	}
	//打印节点
    public void printNodes(){
    	if(root!=null){
    		System.out.print(root.data+"->");
    		root.printNodes();
    		System.out.println();
    	}
    }
    //内部节点类
	private class Node {
		//节点的值
		private int data;
		//节点的下一个节点
		private Node next;
        //构造方法
		Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		private void setData(int data) {
			this.data = data;
		}
       /**
        * 添加元素
        * @param data
        */
		private void addNode(int data) {
			if (this.next == null) {
				this.next = new Node(data);
			} else {
				this.next.addNode(data);
			}
		}
		/**
		 * 删除元素
		 * @param data
		 */
		private void delete(int data){
        	if(this.next!=null){
        		if(this.next.data==data){
        			this.next = this.next.next;
        		}else{
        			this.next.delete(data);
        		}
        	}
        }
        //该元素是否在链表中
		private Boolean contains(int data){
        	if(this.next!=null){
        		if(this.next.data==data){
        			return true;
        		}else{
        			return this.next.contains(data);
        		}
        	}
        	return false;
        }
        //修改链表
		private Boolean update(int oldData,int newData){
        	if(this.next!=null){
        		if(this.next.getData()==oldData){
        			this.next.setData(newData);
        			return true;
        		}else{
        			return this.next.update(oldData, newData);
        		}
        	}
        	return false;
        }
		/**
		 * 链表插入数据
		 * @param index
		 * @param data
		 */
		private void insert(int index,int data){
			current++;
			if(index==current){
				Node newNode = new Node(data);
				newNode.next = this.next;
				this.next = newNode;
			}else{
				this.next.insert(index, data);
			}
		}
		//打印链表
		private void printNodes() {
			if (this.next != null) {
				if(this.next.next!=null){
					System.out.print(this.next.data + "->");
				}else{
					System.out.print(this.next.data);
				}
				this.next.printNodes();
			}
		}
	}
}
