package com.taek.test.livedata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LiveDataViewModel extends ViewModel {
    private MutableLiveData<Integer> score;

    public LiveData<Integer> getCurrentScore() {
        if (score == null) {
            score = new MutableLiveData<>();
            score.setValue(0);
        }
        return score;
    }

    public void addScore(int num) {
        score.setValue(score.getValue() + num);
    }

    public void subScore(int num) {
        score.setValue(score.getValue() - num);
    }
}
