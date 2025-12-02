package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        // TODO: Implement classifyEnergy()

        // checking for null or empty lists
        if(bpms == null || bpms.isEmpty())
        {
            throw new UnsupportedOperationException("The list cannot be null or empty.");
        }
        
        // calculating the average bpm
        double sum = 0;
        for(int bpm : bpms)
        {
            sum += bpm;
        }

        double avg = sum/bpms.size();

        if(avg >= 140)
            return "HIGH";
        else if(avg < 100)
            return "LOW";
        else
            return "NEDIUM";
    }

    public static boolean isValidTrackTitle(String title) {
        // TODO: Implement isValidTrackTitle()
        // checking null or empty string
        if(title == null || title.isEmpty())
            return false;

        // check string length
        if((title.length() < 1) || (title.length()> 30))
            // throw new UnsupportedOperationException("String should be of length 1 to 30");
            return false;

        // checking for special characters
        if(!title.matches("[a-zA-Z0-9 +]+"))
            return false;

        // throw new UnsupportedOperationException("Not implemented");
        return true; 
    }

    public static int normalizeVolume(int volumeDb) {
        // TODO: Implement normalizeVolume()

        if(volumeDb > 100){
            volumeDb = 100;
        }
        else if(volumeDb < 0){
            volumeDb = 0;
        }

        return volumeDb;
        // throw new UnsupportedOperationException("Not implemented");
    }
}
