package com.fitness.fitness.RoutineData;

import com.fitness.fitness.ExerciseGetter.Workout;

import java.util.List;

public abstract class AbstractClass {
    String mWeek;
    int mDay;
    List<Workout> exercise;
    public AbstractClass(String week,int day){
        mWeek = week;
        mDay = day;
    }

    public List<Workout> getDayExercise(){
        switch (mWeek){
            case "Week 1":{
                switch (mDay){
                    case 0:exercise = day0();break;
                    case 1:exercise = day1();break;
                    case 2:exercise = day2();break;
                    case 3:exercise = day3();break;
                    case 4:exercise = day4();break;
                    case 5:exercise = day5();break;
                    case 6:exercise = day6();break;
                }
            }break;
            case "Week 2":{ switch (mDay){
                case 0:exercise = day7();break;
                case 1:exercise = day8();break;
                case 2:exercise = day9();break;
                case 3:exercise = day10();break;
                case 4:exercise = day11();break;
                case 5:exercise = day12();break;
                case 6:exercise = day13();break;
            }
        }break;
            case "Week 3":{ switch (mDay){
                case 0:exercise = day14();break;
                case 1:exercise = day15();break;
                case 2:exercise = day16();break;
                case 3:exercise = day17();break;
                case 4:exercise = day18();break;
                case 5:exercise = day19();break;
                case 6:exercise = day20();break;
            }
            }break;

            case "Week 4": {switch (mDay){
                case 0:exercise = day21();break;
                case 1:exercise = day22();break;
                case 2:exercise = day23();break;
                case 3:exercise = day24();break;
                case 4:exercise = day25();break;
                case 5:exercise = day26();break;
                case 6:exercise = day27();break;
            }
        }break;
        }
        return exercise;
    }
    public abstract List<Workout> day0();
    public abstract List<Workout> day1();
    public abstract List<Workout> day2();
    public abstract List<Workout> day3();
    public abstract List<Workout> day4();
    public abstract List<Workout> day5();
    public abstract List<Workout> day6();
    public abstract List<Workout> day7();
    public abstract List<Workout> day8();
    public abstract List<Workout> day9();
    public abstract List<Workout> day10();
    public abstract List<Workout> day11();
    public abstract List<Workout> day12();
    public abstract List<Workout> day13();
    public abstract List<Workout> day14();
    public abstract List<Workout> day15();
    public abstract List<Workout> day16();
    public abstract List<Workout> day17();
    public abstract List<Workout> day18();
    public abstract List<Workout> day19();
    public abstract List<Workout> day20();
    public abstract List<Workout> day21();
    public abstract List<Workout> day22();
    public abstract List<Workout> day23();
    public abstract List<Workout> day24();
    public abstract List<Workout> day25();
    public abstract List<Workout> day26();
    public abstract List<Workout> day27();
}
