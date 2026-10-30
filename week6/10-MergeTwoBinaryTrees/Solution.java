class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null) {
            return null;
        }

        int val1 = 0;
        int val2 = 0;

        if (root1 != null) {
            val1 = root1.val;
        }

        if (root2 != null) {
            val2 = root2.val;
        }

        TreeNode root = new TreeNode(val1 + val2);

        TreeNode left1 = null;
        TreeNode right1 = null;
        TreeNode left2 = null;
        TreeNode right2 = null;

        if (root1 != null) {
            left1 = root1.left;
            right1 = root1.right;
        }

        if (root2 != null) {
            left2 = root2.left;
            right2 = root2.right;
        }

        root.left = mergeTrees(left1, left2);
        root.right = mergeTrees(right1, right2);

        return root;
    }
}