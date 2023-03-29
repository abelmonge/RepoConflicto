/* 
 * Copyright 2019 José A. Pacheco Ondoño - joanpaon@gmail.com.
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

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author José A. Pacheco Ondoño
 */
public class Main {
    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1")
                 .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        double base;
        double altura;
        System.out.print("base del triangulo :");
        base = SCN.nextDouble();
        System.out.print("altura del triangulo :");
        altura = SCN.nextDouble();
        System.out.print("Area del Triangulo Calculada :"); System.out.println(base*altura/2);
        
    }
}
