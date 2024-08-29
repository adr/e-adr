/*
 * Copyright (c) 2017 Oliver Kopp, Olaf Zimmermann
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   Oliver Kopp, Olaf Zimmermann - initial API and implementation
 */
package io.github.adr.embedded;

import java.util.UUID;

import io.github.adr.linked.ADR;

/**
 * Annotations can, by design, not put everywhere.
 * See https://stackoverflow.com/a/8425778/873282
 *
 * This class is in test, because it tests if it compiles.
 */
@ADR(1)
public class AnnotatedElements {

    @ADR(2)
    public int test() {
        @ADR(3)
        int result;

        // not possible -> no declaration (see https://stackoverflow.com/q/8425674/873282)
        // @ADR(3)
        if (UUID.randomUUID().toString().startsWith("0")) {
            // not possible -> no declaration
            // @ADR(4)
            result = 0;
        } else {
            // not possible -> no declaration
            // @ADR(5)
            result = 42;
        }

        // not possible -> no declaration
        // @ADR(6)
        return result;
    }

}
