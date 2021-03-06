/*
 * #%L
 * How to Include License using Maven
 * $Id: Example.java 340 2014-05-30 19:01:31Z albertattard@gmail.com $
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
package com.javacreed.examples.maven;

import org.apache.commons.lang3.StringUtils;

public class Example {

    public static void main(final String[] args) {
        final String message = null;
        System.out.println(StringUtils.defaultIfBlank(message, "Hello :)"));
    }
}
