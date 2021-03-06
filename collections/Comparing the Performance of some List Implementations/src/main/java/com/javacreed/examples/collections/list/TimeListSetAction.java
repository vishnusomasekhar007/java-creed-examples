/*
 * #%L
 * Comparing the Performance of some List Implementations
 * $Id:$
 * $HeadURL$
 * %%
 * Copyright (C) 2012 - 2014 Java Creed
 * %%
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
 * #L%
 */
package com.javacreed.examples.collections.list;

import java.util.List;

public class TimeListSetAction implements TimeListAction {

  private final String pattern = "Element %d";

  @Override
  public String getName() {
    return "set()";
  }

  @Override
  public long timeAction(final List<String> list, final int limit) {
    for (int i = 0; i < limit; i++) {
      list.add("");
    }

    final long start = System.nanoTime();
    for (int i = 0, size = list.size(); i < limit; i++) {
      list.set(i % size, String.format(pattern, i));
    }
    return System.nanoTime() - start;
  }

}
