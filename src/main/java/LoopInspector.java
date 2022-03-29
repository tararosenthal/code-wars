import java.util.List;
import java.util.ArrayList;

public class LoopInspector {

    public int loopSize(Node node) {

        List<Node> list = new ArrayList<>();

        while(true) {

            node = node.getNext();

            if (!list.contains(node)) {
                list.add(node);
            } else {
                return list.size() - list.indexOf(node);
            }
        }
    }

}