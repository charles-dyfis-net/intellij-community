/*
 * Copyright 2000-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.intellij.openapi.externalSystem.service.ui;

import com.intellij.icons.AllIcons;
import com.intellij.openapi.externalSystem.ExternalSystemUiAware;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * This class is not singleton but offers single-point-of-usage field - {@link #INSTANCE}.
 * 
 * @author Denis Zhdanov
 * @since 5/15/13 12:45 PM
 */
public class DefaultExternalSystemUiAware implements ExternalSystemUiAware {

  @NotNull public static final DefaultExternalSystemUiAware INSTANCE = new DefaultExternalSystemUiAware();

  @Nullable
  @Override
  public Icon getProjectIcon() {
    return AllIcons.Nodes.IdeaProject;
  }

  @Nullable
  @Override
  public Icon getTaskIcon() {
    return IconLoader.getIcon("/icons/task.png", getClass());
  }
}
