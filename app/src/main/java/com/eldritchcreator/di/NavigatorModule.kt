package com.eldritchcreator.di

import androidx.fragment.app.Fragment
import com.eldritchcreator.game.navigation.ChooseAncientOneNavigator
import com.eldritchcreator.game.navigation.GameNavigator
import com.eldritchcreator.home.navigation.HomeNavigator
import com.eldritchcreator.navigation.AncientOneDetailedNavigatorImpl
import com.eldritchcreator.navigation.AncientOnesNavigatorImpl
import com.eldritchcreator.navigation.ChooseAncientOneNavigatorImpl
import com.eldritchcreator.navigation.GameNavigatorImpl
import com.eldritchcreator.navigation.HomeNavigatorImpl
import com.eldritchcreator.register.navigation.AncientOneDetailedNavigator
import com.eldritchcreator.register.navigation.AncientOnesNavigator
import org.koin.dsl.module

val navigatorModule = module {

    // game
    factory<ChooseAncientOneNavigator> { (fragment: Fragment) ->
        ChooseAncientOneNavigatorImpl(fragment)
    }

    factory<GameNavigator> { (fragment: Fragment) ->
        GameNavigatorImpl(fragment)
    }

    // home
    factory<HomeNavigator> { (fragment: Fragment) ->
        HomeNavigatorImpl(fragment)
    }

    // register
    factory<AncientOneDetailedNavigator> { (fragment: Fragment) ->
        AncientOneDetailedNavigatorImpl(fragment)
    }

    factory<AncientOnesNavigator> { (fragment: Fragment) ->
        AncientOnesNavigatorImpl(fragment)
    }
}