package com.example.dagger2.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.dagger2.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    // Equivaut à :
    // @Provides
    // static ViewModelProvider.Factory bindViewModelFactory(
    //      ViewModelProviderFactory viewModelProviderFactory) {
    //
    //      return viewModelProviderFactory;
    // }
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(
            ViewModelProviderFactory viewModelProviderFactory);
}
