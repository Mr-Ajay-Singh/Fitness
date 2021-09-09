package com.fitness.fitness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import com.fitness.fitness.Adapters.HistoryAdapter;
import com.fitness.fitness.database.DataBase;
import com.fitness.fitness.database.DataEntity;

import java.util.List;

public class WorkoutHistory extends AppCompatActivity {

    RecyclerView mRecyclerviewHistory;
    HistoryAdapter historyAdapter;
    DataBase dataBase;
    LinearLayout noItemLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_history);
        dataBase = DataBase.getInstance(getApplicationContext());
        noItemLayout = findViewById(R.id.layout_no_item_workout_history);
        mRecyclerviewHistory = findViewById(R.id.recyclerview_workout_history);
        mRecyclerviewHistory.setLayoutManager(new LinearLayoutManager(this));
        //new GetHistory().execute();
        AppExecutor.getsInstance().getmDiskIO().execute(new Runnable() {
            @Override
            public void run() {
                final List<DataEntity> entities = dataBase.daoInterface().getData();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if(entities!=null && entities.size()>0)
                        {
                            historyAdapter = new HistoryAdapter(WorkoutHistory.this,entities);
                            mRecyclerviewHistory.setAdapter(historyAdapter);
                        }
                        else
                        {
                            noItemLayout.setVisibility(View.VISIBLE);
                        }
                    }
                });
            }
        });


    }

    class GetHistory extends AsyncTask<Void,Void, List<DataEntity>>{

        @Override
        protected List<DataEntity> doInBackground(Void... voids) {
            List<DataEntity> entities = dataBase.daoInterface().getData();
            try{
                Log.i("dataEntitiesCheck",String.valueOf(entities.size()));
            }
            catch (Exception e)
            {
                Log.i("dataEntitiesCheck","Erroe SHow");
            }
            return entities;
        }

        @Override
        protected void onPostExecute(List<DataEntity> dataEntities) {
            super.onPostExecute(dataEntities);

            if(dataEntities!=null && dataEntities.size()>0)
            {
                historyAdapter = new HistoryAdapter(WorkoutHistory.this,dataEntities);
                mRecyclerviewHistory.setAdapter(historyAdapter);
            }
            else
            {
                noItemLayout.setVisibility(View.VISIBLE);
            }

        }
    }
}