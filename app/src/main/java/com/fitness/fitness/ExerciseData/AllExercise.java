package com.fitness.fitness.ExerciseData;

import android.content.Context;

import com.fitness.fitness.ExerciseGetter.Exercise;
import com.fitness.fitness.R;

public class AllExercise {


    private Context context;
    public Exercise mLeftQuadStretch,mRightSidePlankCrunch,mShoulderCircle,mShoulderPushUp,mStraightArmPlank,mBicepsStretch,
            mBridge,mCalfRaise,mCrossPunchRoll,mCrunch,mHamstringStretch,mItbandStretch,mJogInPlace,mJumpSquat,
            mJupingJack,mKickbackLeft,mLeftLegBridge,mLeftSideLying,mLeftSidePlankCrunch,mLegLoweringDrill,mLowerSideToSideLunge
            ,mLungeWithArmReach,mLunges,mMountainClimb,mPlankWithLeftLegLift,mPushUpAmpRotation,mRightLegRaise,mSquats,
            mWideStanceSquat,mStepUpOntoChair,mSumoSquats,mTableTopDip,mWallMountainClimber,mWallExercise,mPushUp;
    public AllExercise(Context ctx)
    {
        context = ctx;
        mLeftQuadStretch = new Exercise(R.drawable.left_quad_stretch, context.getString(R.string.quad_stretch_name), context.getString(R.string.quad_stretch));
        mRightSidePlankCrunch = new Exercise(R.drawable.right_side_plank_crunch, context.getString(R.string.right_side_plank_crunch_name), context.getString(R.string.right_side_plank_crunch));
        mShoulderCircle = new Exercise(R.drawable.shoulder_circle, context.getString(R.string.shoulder_circle_name), context.getString(R.string.shoulder_circle));
        mShoulderPushUp = new Exercise(R.drawable.shoulder_push_up, context.getString(R.string.shoulder_pushup_name), context.getString(R.string.shoulder_push_up));
        mStraightArmPlank = new Exercise(R.drawable.straight_arm_plank, context.getString(R.string.straight_armp_name), context.getString(R.string.straight_armp));
        mWallMountainClimber = new Exercise(R.drawable.wall_mountain_climber, context.getString(R.string.wall_mountain_climber_name), context.getString(R.string.wall_exercise));
        mPushUp = new Exercise(R.drawable.push_up, context.getString(R.string.pushup_name), context.getString(R.string.push_up));
        mBicepsStretch = new Exercise(R.drawable.biceps_stretch, context.getString(R.string.biceps_stretch_name), context.getString(R.string.push_up));
        mBridge = new Exercise(R.drawable.bridge, context.getString(R.string.bridge_name), context.getString(R.string.push_up));
        mCalfRaise = new Exercise(R.drawable.calf_raise, context.getString(R.string.calf_raise_name), context.getString(R.string.push_up));
        mCrossPunchRoll = new Exercise(R.drawable.cross_punch_roll, context.getString(R.string.cross_punch_roll_name), context.getString(R.string.push_up));
        mCrunch = new Exercise(R.drawable.crunch, context.getString(R.string.crunch_name), context.getString(R.string.push_up));
        mHamstringStretch = new Exercise(R.drawable.hamstring_stretch, context.getString(R.string.hamstring_stretch_name), context.getString(R.string.push_up));
        mItbandStretch = new Exercise(R.drawable.itbend_stretch, context.getString(R.string.itband_stretch_name), context.getString(R.string.push_up));
        mJogInPlace = new Exercise(R.drawable.jog_in_place, context.getString(R.string.jog_in_place_name), context.getString(R.string.push_up));
        mJumpSquat = new Exercise(R.drawable.jump_squat, context.getString(R.string.jump_squat_name), context.getString(R.string.push_up));
        mJupingJack = new Exercise(R.drawable.jumping_jack, context.getString(R.string.jumping_jack_name), context.getString(R.string.push_up));
        mKickbackLeft = new Exercise(R.drawable.kickback_left, context.getString(R.string.kick_back_name), context.getString(R.string.push_up));
        mLeftLegBridge = new Exercise(R.drawable.left_leg_bridge, context.getString(R.string.left_leg_raise_name), context.getString(R.string.push_up));
        mLeftSideLying = new Exercise(R.drawable.left_side_lying, context.getString(R.string.left_leg_side_lying_name), context.getString(R.string.push_up));
        mLeftSidePlankCrunch = new Exercise(R.drawable.left_side_plank_crunch, context.getString(R.string.left_side_plank_crunch_name), context.getString(R.string.push_up));
        mLegLoweringDrill = new Exercise(R.drawable.leg_lowering_drill, context.getString(R.string.leg_lowering_drill_name), context.getString(R.string.push_up));
        mLowerSideToSideLunge = new Exercise(R.drawable.lower_side_to_side_lunge, context.getString(R.string.lower_side_to_side_lunge_name), context.getString(R.string.push_up));
        mLungeWithArmReach = new Exercise(R.drawable.lunge_with_arm_reach, context.getString(R.string.lunge_with_arm_reach_name), context.getString(R.string.push_up));
        mLunges = new Exercise(R.drawable.lunges, context.getString(R.string.lunges_name), context.getString(R.string.push_up));
        mMountainClimb = new Exercise(R.drawable.mountain_climber, context.getString(R.string.mountain_climb_name), context.getString(R.string.push_up));
        mPlankWithLeftLegLift = new Exercise(R.drawable.plank_with_left_leg_lift, context.getString(R.string.plank_with_leg_lift_name), context.getString(R.string.push_up));
        mPushUpAmpRotation = new Exercise(R.drawable.push_up_amp_rotation, context.getString(R.string.pushup_amp_rotation_name), context.getString(R.string.push_up));
        mSquats = new Exercise(R.drawable.squats, context.getString(R.string.squats_name), context.getString(R.string.push_up));
        mRightLegRaise = new Exercise(R.drawable.right_leg_raise, context.getString(R.string.right_leg_raise_name), context.getString(R.string.push_up));
        mWideStanceSquat = new Exercise(R.drawable.wide_stance_squat, context.getString(R.string.wide_stand_squats_name), context.getString(R.string.push_up));
        mStepUpOntoChair = new Exercise(R.drawable.step_up_onto_chair, context.getString(R.string.step_up_onto_chair_name), context.getString(R.string.push_up));
        mSumoSquats = new Exercise(R.drawable.sumo_squats, context.getString(R.string.sumo_squats_name), context.getString(R.string.push_up));
        mTableTopDip = new Exercise(R.drawable.table_top_dip, context.getString(R.string.table_top_dip_name), context.getString(R.string.push_up));

    }




}
