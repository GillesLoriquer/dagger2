package com.example.dagger2.di.auth;

import androidx.lifecycle.ViewModel;

import com.example.dagger2.di.ViewModelKey;
import com.example.dagger2.viewmodels.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel authViewModel);
}
