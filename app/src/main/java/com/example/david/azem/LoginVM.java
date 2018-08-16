package com.example.david.azem;


import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class LoginVM extends ViewModel {
    //TODO: create apiservice that returns mock data for temperary use until the firebase database is set up with proper API endpoint
    ApiService api = new ApiService();
    
    public LoginVM()
    {
        LiveData<UserLoginInformation> userInformation = new MutableLiveData<>();
        LiveDate<LoginState> loginState = new MutableLiveData<>();

    }
    public boolean loginAttempt(String user, String password)
    {
        return response = api.login(user,password);        
    }
}
