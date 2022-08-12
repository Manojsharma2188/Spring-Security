package com.manoj.Tree;

public class TreeRunner {

	public static void main(String[] args) {

		Tree tree = new Tree();
		tree.insert(11);
		tree.insert(20);
		tree.insert(3);
		tree.insert(42);
		tree.insert(16);
		tree.insert(32);
		tree.insert(9);
		tree.insert(4);
		tree.insert(10);

		Node node = tree.search(32);
		if (node != null) {
			System.out.println("Elemnt found ");
			node.display();
			System.out.println();

		} else {
			System.out.println("Elemnt not found");
		}
		Node node1 = tree.search(2);
		if (node1 != null) {
			System.out.println("Element found.");
			node1.display();
			System.out.println();
		} else {
			System.out.println("Element not found.");
		}

		// preorder traverse - root, left, right
		tree.traverse(1);

		// inorder traverse - left, root, right
		tree.traverse(2);

		// postorder traverse - left, right, root
		tree.traverse(3);

	}

}
