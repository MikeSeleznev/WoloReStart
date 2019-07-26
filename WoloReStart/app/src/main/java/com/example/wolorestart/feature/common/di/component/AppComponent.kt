package com.example.wolorestart.feature.common.Component

import com.example.wolorestart.WoloApp
import com.example.wolorestart.feature.common.Scope.PerApplication
import dagger.Component


@PerApplication
@Component(modules = [])
interface AppComponent {
    fun inject(application: WoloApp)

    fun inject(activity: BaseActivity)
}