package com.manoj.Tree;

public class Tree {

	private Node root;

	public Tree() {
		root = null;
	}

	public Node search(int data) {
		Node current = root;
		System.out.println("Visiting Elements .........");
		while (current.data != data) {
			if (current != null) {
				System.out.println(current.data + " ");
				if (current.data > data) {
					current = current.leftChild;
				} else {
					current = current.rightChild;
				}

				if (current == null) {
					return null;
				}
			}
		}

		return current;
	}

	public void insert(int data) {
		Node tempNode = new Node();
		tempNode.data = data;

		if (root == null) {
			root = tempNode;
		} else {

			Node current = root;
			Node parent = null;

			while (true) {
				parent = current;

				if (parent.data > data) {
					current = parent.leftChild;
					if (current == null) {
						parent.leftChild = tempNode;
						return;
					}

				} else {
					current = parent.rightChild;
					if (current == null) {
						parent.rightChild = tempNode;
						return;
					}

				}

			}
		}
	}

	public void traverse(int traverseType) {

		switch (traverseType) {
		case 1:
			System.out.println("PreOrder traverse");
			preOrder(root);
			break;

		case 2:
			System.out.println("Inorder Traverse");
			inOrder(root);
			break;
		case 3:
			System.out.println("Post Order Traverse");
			postOrder(root);
			break;
		}
	}

	private void postOrder(Node root2) {

		if (root2 != null) {
			postOrder(root2.leftChild);
			postOrder(root2.rightChild);
			System.out.println(root2.data + " ");
		}

	}

	private void inOrder(Node root2) {

		if (root2 != null) {
			inOrder(root2.leftChild);
			System.out.println(root2.data + " ");
			inOrder(root2.rightChild);
		}

	}

	private void preOrder(Node root2) {

		 if(root2!=null){
	         System.out.print(root2.data + " ");
	         preOrder(root2.leftChild);
	         preOrder(root2.rightChild);
	      }

	}
}
