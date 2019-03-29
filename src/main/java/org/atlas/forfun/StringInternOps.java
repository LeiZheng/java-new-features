
/*
 *
 *  Copyright 2012-2017 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *
 */

package org.atlas.forfun;

import java.util.ArrayList;
import java.util.List;

public class StringInternOps {

    public static void main(String[] args) {

        System.out.println("Performance test with string intern()");
        int step = 10000;
        final List<String> lst = new ArrayList<String>( step );
        final int totalStrings = 100 * step;
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < totalStrings + 1; i++) {
            lst.add(("" + i).intern());
            if (i % step == 0) {
                System.out.println("the total time to construct " + i + " strings " + (System.currentTimeMillis() - currentTime) + " ms");
            }
        }
    }
}
