/*
 * #%L
 * Using Collections with Multiverse
 * $Id:$
 * $HeadURL:$
 * %%
 * Copyright (C) 2012 - 2015 Java Creed
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
package com.javacreed.examples.multiverse.part2;

import org.slf4j.Logger;

import com.javacreed.examples.multiverse.utils.LoggerUtils;

public class Example2 {

  private static final Logger LOGGER = LoggerUtils.getLogger(Example2.class);

  public static void main(final String[] args) {
    final Member a = new Member("Albert Attard");

    final Group g = new Group();
    g.addMember(a);
    g.addMember(new Member("Mary Vella"));
    g.addMember(new Member("Joe Borg"));
    Example2.LOGGER.debug("Size of group: {}", g.size());
    Example2.LOGGER.debug("Size of group: {}", g);

    // The remove will not work as expected
    final boolean removed = g.removeMember(a);
    Example2.LOGGER.debug("Member removed: {}", removed);
    Example2.LOGGER.debug("Size of group: {}", g.size());
    Example2.LOGGER.debug("Size of group: {}", g);
  }
}
