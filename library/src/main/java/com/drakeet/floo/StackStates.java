/*
 * Copyright 2017 drakeet. https://github.com/drakeet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.drakeet.floo;

import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;

/**
 * @author drakeet
 */
public interface StackStates {

  interface Target {
    @NonNull @CheckResult Flow popCount(@IntRange(from = 1) int count);
    @NonNull @CheckResult Flow target(@NonNull String indexKey);
  }

  interface Flow {
    @NonNull @CheckResult End result(@NonNull Object result);
    void start();
  }

  interface End {
    void start();
  }
}