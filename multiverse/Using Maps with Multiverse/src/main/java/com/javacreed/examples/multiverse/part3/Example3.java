/*
 * #%L
 * Using Maps with Multiverse
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
package com.javacreed.examples.multiverse.part3;

import org.slf4j.Logger;

import com.javacreed.examples.multiverse.utils.LoggerUtils;

public class Example3 {

  private static final Logger LOGGER = LoggerUtils.getLogger(Example3.class);

  public static void main(final String[] args) {
    final Group g = new Group();
    g.addMember(new Member("Albert Attard"));
    g.addMember(new Member("Mary Vella"));
    g.addMember(new Member("Joe Borg"));
    Example3.LOGGER.debug("Size of group: {}", g.size());
    Example3.LOGGER.debug("Size of group: {}", g);
  }
}
