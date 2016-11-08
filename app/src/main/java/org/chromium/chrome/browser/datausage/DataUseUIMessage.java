
// Copyright 2016 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../chrome/browser/android/data_usage/data_use_tab_ui_manager_android.cc

package org.chromium.chrome.browser.datausage;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class DataUseUIMessage {
  @IntDef({
      DATA_USE_TRACKING_STARTED_SNACKBAR_MESSAGE, DATA_USE_TRACKING_SNACKBAR_ACTION,
      DATA_USE_TRACKING_ENDED_SNACKBAR_MESSAGE, DATA_USE_TRACKING_ENDED_TITLE,
      DATA_USE_TRACKING_ENDED_MESSAGE, DATA_USE_TRACKING_ENDED_CHECKBOX_MESSAGE,
      DATA_USE_TRACKING_ENDED_CONTINUE, DATA_USE_LEARN_MORE_TITLE, DATA_USE_LEARN_MORE_LINK_URL,
      DATA_USE_UI_MESSAGE_MAX
  })
  @Retention(RetentionPolicy.SOURCE)
  public @interface DataUseUIMessageEnum {}
  public static final int DATA_USE_TRACKING_STARTED_SNACKBAR_MESSAGE = 0;
  public static final int DATA_USE_TRACKING_SNACKBAR_ACTION = 1;
  public static final int DATA_USE_TRACKING_ENDED_SNACKBAR_MESSAGE = 2;
  public static final int DATA_USE_TRACKING_ENDED_TITLE = 3;
  public static final int DATA_USE_TRACKING_ENDED_MESSAGE = 4;
  public static final int DATA_USE_TRACKING_ENDED_CHECKBOX_MESSAGE = 5;
  public static final int DATA_USE_TRACKING_ENDED_CONTINUE = 6;
  public static final int DATA_USE_LEARN_MORE_TITLE = 7;
  public static final int DATA_USE_LEARN_MORE_LINK_URL = 8;
  public static final int DATA_USE_UI_MESSAGE_MAX = 9;
}