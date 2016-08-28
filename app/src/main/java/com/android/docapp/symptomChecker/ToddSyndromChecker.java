package com.android.docapp.symptomChecker;

/**
 * Created by hp pc on 28-08-2016.
 */
public class ToddSyndromChecker {

    private static ToddSyndromChecker ourInstance = new ToddSyndromChecker();
    public static ToddSyndromChecker getInstance() {
        return ourInstance;
    }

    private ToddSyndromChecker() {
    }

    public int checkToddSyndrome(int age, boolean migraine, boolean male, boolean hallucinogenicDrugs)
    {
        int probability = 0;

        if(age <= 15)
            probability = probability + 25;
        if(migraine)
            probability = probability + 25;
        if(male)
            probability = probability + 25;
        if(hallucinogenicDrugs)
            probability = probability + 25;

        return probability;
    }
}
