/*
 * Copyright (c) 2016-2017 Oliver Kopp, Olaf Zimmermann
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Oliver Kopp, Olaf Zimmermann - initial API and implementation
 */
package io.github.adr.embedded.demo;
// import java.util.UUID;

import io.github.adr.embedded.YStatementJustification;

@YStatementJustification(
        chosen = "we decided to implement business logic in POJOs",
        neglected = "other options such as JEE EJBs and Spring components")
public class YStatementAnnotationDemoClass {

    public int sampleBusinessLogic(String input) {
        return 42;
    }
}
