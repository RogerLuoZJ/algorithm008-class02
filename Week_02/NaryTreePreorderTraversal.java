import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }

        public List<Integer> preorder(Node root) {
            List<Integer> list = new ArrayList();
            this.doPreorder(list, root);
            return list;
        }

        private void doPreorder(List<Integer> list, Node root) {
            if (root != null) {
                list.add(root.val);
                if (root.children != null && root.children.size() > 0) {
                    for (Node node : root.children) {
                        doPreorder(list, node);
                    }
                }
            }
        }
    }
}
