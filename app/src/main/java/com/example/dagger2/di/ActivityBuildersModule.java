package com.example.dagger2.di;

import com.example.dagger2.di.auth.AuthViewModelModule;
import com.example.dagger2.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelModule.class}
    )
    abstract AuthActivity contributeAuthActivity();
}
