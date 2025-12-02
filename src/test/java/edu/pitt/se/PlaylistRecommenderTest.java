package edu.pitt.se;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class PlaylistRecommenderTest {
    
    // bpms testing
    @Test
    public void testHighEnergy() {
        List<Integer> bpms = Arrays.asList(120, 140, 160, 180, 200);
        assertEquals(PlaylistRecommender.classifyEnergy(bpms), "HIGH");
    }

    @Test
    public void testMediumEnergy() {
        List<Integer> bpms = Arrays.asList(100, 125, 80, 95, 195);
        assertEquals(PlaylistRecommender.classifyEnergy(bpms), "MEDIUM");
    }

    @Test
    public void testLowEnergy() {
        List<Integer> bpms = Arrays.asList(20, 140, 65, 90, 180);
        assertEquals(PlaylistRecommender.classifyEnergy(bpms), "LOW");
    }

    // track title testing
    @Test
    public void testTrackTitle() {
        assertFalse(PlaylistRecommender.isValidTrackTitle("Shruti@123"));
    }

    // volume testing
    @Test
    public void testVolume() {
        assertEquals(PlaylistRecommender.normalizeVolume(110), 100);
    }
}
