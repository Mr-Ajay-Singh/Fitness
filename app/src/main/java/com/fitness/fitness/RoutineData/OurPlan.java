package com.fitness.fitness.RoutineData;

import android.content.Context;
import android.util.Log;

import com.fitness.fitness.ExerciseData.AllExercise;
import com.fitness.fitness.ExerciseGetter.Workout;
import com.fitness.fitness.ExercisePreDetail;

import java.util.ArrayList;
import java.util.List;

public class OurPlan extends AbstractClass {
    Context context;
    public OurPlan(Context ctx,String week,int day){
        super(week,day);
        context = ctx;

    }

    @Override
    public List<Workout> getDayExercise() {
        return super.getDayExercise();
    }

    @Override
    public List<Workout> day0() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day1() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day2() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day3() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day4() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);

        return dailyList;
    }

    @Override
    public List<Workout> day5() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day6() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day7() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day8() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day9() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day10() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day11() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day12() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day13() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day14() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day15() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day16() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day17() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day18() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day19() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day20() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day21() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day22() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day23() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day24() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day25() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day26() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }

    @Override
    public List<Workout> day27() {
        List<Workout> dailyList= new ArrayList<>();
        if(context instanceof ExercisePreDetail)
            Log.i("check","Correct1");
        AllExercise allExercise = new AllExercise(context);
        Workout wk1 = new Workout(allExercise.mLeftQuadStretch,20,false);
        dailyList.add(wk1);
        Workout wk2 = new Workout(allExercise.mRightSidePlankCrunch,25,true);
        dailyList.add(wk2);
        Workout wk3 = new Workout(allExercise.mShoulderCircle,10,false);
        dailyList.add(wk3);
        Workout wk4 = new Workout(allExercise.mShoulderPushUp,25,true);
        dailyList.add(wk4);
        Workout wk5 = new Workout(allExercise.mStraightArmPlank,20,false);
        dailyList.add(wk5);
        Workout wk6 = new Workout(allExercise.mWallMountainClimber,10,false);
        dailyList.add(wk6);
        Workout wk7 = new Workout(allExercise.mPushUp,10,false);
        dailyList.add(wk7);
        Workout wk8 = new Workout(allExercise.mBicepsStretch,10,false);
        dailyList.add(wk8);

        return dailyList;
    }
}
