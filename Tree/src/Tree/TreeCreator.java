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
	
	public TreeNode creatorTree(String preOrder,String inOrder) {
		
		if(preOrder.equals("")) {
			return null;
		}
		char rootValue=preOrder.charAt(0);
		int rootIndex =inOrder.indexOf(rootValue);
		TreeNode root=new TreeNode(rootValue);
		
		root.setLefg(
				creatorTree(
						preOrder.substring(1, rootIndex+1),
						inOrder.substring(0, rootIndex)));
				
		root.setRight(creatorTree(
				preOrder.substring(1+rootIndex),
				inOrder.substring(1+rootIndex)
				));		
		return root;
		
	
}}
