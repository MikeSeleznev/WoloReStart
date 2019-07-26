package com.example.wolorestart.feature.common.model.repository

import android.util.Log
import com.example.wolorestart.feature.common.model.Storage.WoloDatabase
import io.reactivex.Completable
import javax.inject.Inject

class WoloRepositoryImpl
    @Inject
    constructor(
        private val database: WoloDatabase
    ) : WoloRepository{
    override fun loadPacks(): Completable = Completable.fromAction {
        Log.d("WoloRepository", " Pack started to load")
        //TODO
    }


}
