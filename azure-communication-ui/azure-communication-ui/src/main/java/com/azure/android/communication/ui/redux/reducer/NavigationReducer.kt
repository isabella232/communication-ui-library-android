// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.android.communication.ui.redux.reducer

import com.azure.android.communication.ui.redux.action.Action
import com.azure.android.communication.ui.redux.action.NavigationAction
import com.azure.android.communication.ui.redux.state.NavigationState
import com.azure.android.communication.ui.redux.state.NavigationStatus

internal interface NavigationReducer : Reducer<NavigationState>

internal class NavigationReducerImpl : NavigationReducer {
    override fun reduce(state: NavigationState, action: Action): NavigationState {
        return when (action) {
            is NavigationAction.Exit -> {
                NavigationState(NavigationStatus.EXIT)
            }
            is NavigationAction.CallLaunched -> {
                NavigationState(NavigationStatus.IN_CALL)
            }
            is NavigationAction.SetupLaunched -> {
                NavigationState(NavigationStatus.SETUP)
            }
            else -> state
        }
    }
}
