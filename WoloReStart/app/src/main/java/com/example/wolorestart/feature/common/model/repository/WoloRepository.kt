package com.example.wolorestart.feature.common.model.repository

import io.reactivex.Completable

interface WoloRepositiry {

    fun loadPacks():Completable
}