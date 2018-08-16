package com.example.david.azem;


import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class LoginVM extends ViewModel {

    public LoginVM()
    {
        LiveData<UserLoginInformation> userInformation = new MutableLiveData<>();
        LiveDate<LoginState> loginState = new MutableLiveData<>();

    }

}
