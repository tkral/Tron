/*
 * Copyright (c) 2013 Hal Hildebrand, all rights reserved.
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

package com.hellblazer.tron.documentation;

import com.sun.source.tree.ConditionalExpressionTree;
import com.sun.source.tree.MethodTree;

/**
 * @author hhildebrand
 * 
 */
public class Transition {
    private ConditionalExpressionTree guard;
    private MethodTree                transition;
    private State                     nextState;
    private State                     pushState;
    private State                     popState;
}
