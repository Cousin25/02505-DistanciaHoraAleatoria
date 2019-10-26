/* 
 * Copyright 2019 ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com.
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
package org.japo.java.main;

import java.util.Calendar;
import java.util.Random;

/**
 *
 * @author ANDRÉS COSÍN ZAMARREÑO - Cousin183@gmail.com
 */
public class Main {

    public static final Random RND = new Random();
    public static final Calendar CAL = Calendar.getInstance();

    public static void main(String[] args) {

        int hAct = CAL.get(Calendar.HOUR_OF_DAY);
        int mAct = CAL.get(Calendar.MINUTE);
        int sAct = CAL.get(Calendar.SECOND);

        int MIN = 0;

        int hINIT = RND.nextInt(hAct - MIN + 1) + MIN;
        int mINIT = RND.nextInt(mAct - MIN + 1) + MIN;
        int sINIT = RND.nextInt(sAct - MIN + 1) + MIN;

        int Act_total = hAct * 3600 + mAct * 60 + sAct;
        int INIT_total = hINIT * 3600 + mINIT * 60 + sINIT;

        int tiempo_clase = Act_total - INIT_total;

        int hora_total = tiempo_clase / 3600;
        int mins_total = (tiempo_clase % 3600) / 60;
        int secs_total = (tiempo_clase % 3600) % 60;

        System.out.printf("Hora actual.......: %02d:%02d:%02d%n", hAct, mAct, sAct);
        System.out.printf("Hora inicio.......: %02d:%02d:%02d%n", hINIT, mINIT, sINIT);
        System.out.printf("Tiempo de clase...: %02d:%02d:%02d%n", hora_total, mins_total, secs_total);

    }

}
