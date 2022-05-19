import org.junit.jupiter.api.*;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ConwayLifeTest{

    @Test
    public void testGlider() {
        int[][][] gliders = {
                        {{1,0,0},
                        {0,1,1},
                        {1,1,0}},
                        {{0,1,0},
                        {0,0,1},
                        {1,1,1}}
        };
        System.out.println("Glider");
        System.out.print(Arrays.deepToString(gliders[0]));
        int[][] res = ConwayLife.getGeneration(gliders[0], 1);
        assertEquals(Arrays.deepToString(res), Arrays.deepToString(gliders[1]));
    }

}