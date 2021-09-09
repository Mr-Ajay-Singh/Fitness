package com.fitness.fitness.ExerciseGetter;

import android.graphics.drawable.Drawable;

public class Exercise {
    int mImageLocation;
    String mExerciseName;
    String mExerciseInfo;

    public int getImageLocation() {
        return mImageLocation;
    }

    public String getExerciseName() {
        return mExerciseName;
    }

    public String getExerciseInfo() {
        return mExerciseInfo;
    }



    public Exercise(int location,String name,String info)
    {
        mImageLocation =location;
        mExerciseName = name;
        mExerciseInfo = info;
    }

}
