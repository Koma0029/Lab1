package data;

import androidx.lifecycle.MutableLiveData;

public class MainViewModel {
    public MutableLiveData<Boolean> isSelected= new MutableLiveData<>();

    // Constructor or any initialization method where you set initial value
    public MainViewModel() {
        isSelected.setValue(false); // Set initial value
}



}
