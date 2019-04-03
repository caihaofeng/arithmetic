package Tree;

import javax.sql.rowset.spi.SyncProvider;

public class TreeTraversal {

	public void preOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		System.out.print(root.getValue());
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.getLeft());
		System.out.print(root.getValue());
		inOrder(root.getRight());
	}
	public void postOrder(TreeNode root) {
		if(root == null) {
			return;
		}
	
		postOrder(root.getLeft());
		
		postOrder(root.getRight());
		System.out.print(root.getValue());
	}
	
	
	public static void main(String[] args) {
			
		TreeCreator creator=new TreeCreator();
		TreeTraversal treaversal =new TreeTraversal();
		
		TreeNode sampleTree=creator.creatorSampleTree();
		treaversal.preOrder(sampleTree);
		System.out.println();
		treaversal.inOrder(sampleTree);
		System.out.println();
		treaversal.postOrder(sampleTree);
		System.out.println();
		System.out.println("=====");
		TreeNode tree=creator.creatorTree("ABDEGCF", "DBGEACF");
		treaversal.postOrder(tree);
		}
}
