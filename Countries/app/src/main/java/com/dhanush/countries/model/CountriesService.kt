package com.dhanush.countries.model

import com.dhanush.countries.di.DaggerApiComponent
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Inject

class CountriesService {

    @Inject
    lateinit var api: CountriesApi
    init {
        DaggerApiComponent.create().inject(this) //this: countryService
    }
    fun getCountries(): Single<List<Country>> {
        return api.getCountries()
    }
}