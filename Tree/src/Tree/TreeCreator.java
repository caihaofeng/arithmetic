package Tree;

public class TreeCreator {

	public TreeNode creatorSampleTree() {
		TreeNode root =new TreeNode('A');
		root.setLefg(new TreeNode('B'));
		root.getLeft().setLefg(new TreeNode('D'));
		root.getLeft().setRight(new TreeNode('E'));
		root.getLeft().getRight().setLefg(new TreeNode('G'));
		root.setRight(new TreeNode('C'));
		root.getRight().setRight(new TreeNode('F'));
		return root;
		
	}
	
}
