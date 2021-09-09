package com.fitness.fitness.Adapters;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.fitness.fitness.ExerciseGetter.Workout;
import com.fitness.fitness.R;

import java.time.format.TextStyle;
import java.util.List;

import static android.graphics.Typeface.BOLD;

public class PreExerciseAdapter extends RecyclerView.Adapter<PreExerciseAdapter.PreExerciseViewHolder> {

    private final List<Workout> exerciseList;
    private Context context;
    private ImageView mBackButton;

    public PreExerciseAdapter(Context ctx, List<Workout> plan)
    {
        context = ctx;
        exerciseList = plan;
    }

    @NonNull
    @Override
    public PreExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.pre_exercise_view_holder,parent,false);
        return new PreExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PreExerciseViewHolder holder, int position) {
            holder.mExerciseName.setText(exerciseList.get(position).getExercise().getExerciseName());
            if(exerciseList.get(position).getType())
                holder.mExerciseCount.setText("00:"+String.valueOf(exerciseList.get(position).getCount()));
            else
                holder.mExerciseCount.setText("x"+String.valueOf(exerciseList.get(position).getCount()));
            holder.SetImage();
            holder.OnItemClick();

    }

    @Override
    public int getItemCount() {
        return exerciseList.size();
    }

    class PreExerciseViewHolder extends RecyclerView.ViewHolder {
        TextView mExerciseName,mExerciseCount;
        ImageView mExerciseImage;
        CardView mCardViewPreHolder;
        public PreExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
            mExerciseImage = itemView.findViewById(R.id.image_pre_holder);
            mExerciseName = itemView.findViewById(R.id.exercise_name_pre_holder);
            mExerciseCount = itemView.findViewById(R.id.exercise_count_pre_holder);
            mCardViewPreHolder = itemView.findViewById(R.id.cardView_pre_holder);
        }

        public void SetImage()
        {
            Glide.with(context).load(exerciseList.get(getLayoutPosition()).getExercise().getImageLocation()).into(mExerciseImage);
        }

        public void OnItemClick()
        {


            mCardViewPreHolder.setOnClickListener(new View.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP_MR1)
                @Override
                public void onClick(View view) {
                    final Dialog preDialog = new Dialog(context);
                    preDialog.setContentView(R.layout.dialog_pre_exercise_holder);

                    mBackButton = preDialog.findViewById(R.id.back_in_pre_dialog);
                    ImageView imageInDialog = preDialog.findViewById(R.id.image_dialog_pre_holder);
                    TextView nameInDialog = preDialog.findViewById(R.id.text_name_dialog_pre_holder);
                    TextView detailInDialog = preDialog.findViewById(R.id.text_detail_dialog_pre_holder);
                    preDialog.getWindow().setBackgroundDrawableResource(R.drawable.corner_curve);
                    preDialog.getWindow().setElevation(3.0f);

                    Glide.with(context).load(exerciseList.get(getLayoutPosition()).getExercise().getImageLocation()).into(imageInDialog);
                    String str = exerciseList.get(getLayoutPosition()).getExercise().getExerciseInfo();

                    Spannable spannable = getSpannableString(str);
                    nameInDialog.setText(exerciseList.get(getLayoutPosition()).getExercise().getExerciseName());
                    detailInDialog.setText(spannable, TextView.BufferType.SPANNABLE);


                        mBackButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (preDialog != null && preDialog.isShowing())
                                {
                                preDialog.dismiss();
                                }
                            }
                    });
                    if(preDialog!=null&&!preDialog.isShowing())
                    {
                        preDialog.show();
                    }
                }
            });

        }
    }

    private Spannable getSpannableString(String str) {
        Spannable spannable = new SpannableString(str);
        int index = str.indexOf("\n\n");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            spannable.setSpan(new ForegroundColorSpan(context.getColor(R.color.darkBlue)),0,8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannable.setSpan(new StyleSpan(BOLD),0,8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannable.setSpan(new RelativeSizeSpan(1.3f),0,8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        while (index >= 0)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                spannable.setSpan(new ForegroundColorSpan(context.getColor(R.color.darkBlue)),index,index+9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                spannable.setSpan(new StyleSpan(BOLD),index,index+9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                spannable.setSpan(new RelativeSizeSpan(1.3f),index,index+9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);


            }
            index = str.indexOf("\n\n",index+1);
        }
        return spannable;
    }
}
