import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;

class PaginationHelperTests {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
    PaginationHelper<Integer> helper = new PaginationHelper<>(list, 4);

    @Test
    void testPagination() {
        assertEquals(helper.itemCount(), 6);
        assertEquals(helper.pageCount(), 2);
        assertEquals(helper.pageItemCount(1), 2);
        assertEquals(helper.pageIndex(2), 0);
    }
}

