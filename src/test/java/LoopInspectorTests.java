import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoopInspectorTests {

    @Test public void loop_size_of_3() {
        Node list = Node.createChain(1, 3);
        int result = new LoopInspector().loopSize(list);
        assertEquals(3, result);
    }

    @Test public void loop_size_of_29() {
        Node list = Node.createChain(21, 29);
        int result = new LoopInspector().loopSize(list);
        assertEquals(29, result);
    }

    @Test public void loop_size_of_1087() {
        Node list = Node.createChain(3904, 1087);
        int result = new LoopInspector().loopSize(list);
        assertEquals(1087, result);
    }

}
