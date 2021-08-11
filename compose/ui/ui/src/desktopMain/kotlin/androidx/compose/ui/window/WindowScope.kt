/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.compose.ui.window

import java.awt.Window

/**
 * Receiver scope which is used by [androidx.compose.ui.window.Window] and
 * [androidx.compose.ui.window.Dialog].
 */
interface WindowScope : OwnerWindowScope {
    /**
     * [Window] that was created inside [androidx.compose.ui.window.Window]
     * or [androidx.compose.ui.window.Dialog]
     */
    val window: Window

    override val ownerWindow: Window get() = window
}