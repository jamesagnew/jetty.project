//
//  ========================================================================
//  Copyright (c) 1995-2016 Mort Bay Consulting Pty. Ltd.
//  ------------------------------------------------------------------------
//  All rights reserved. This program and the accompanying materials
//  are made available under the terms of the Eclipse Public License v1.0
//  and Apache License v2.0 which accompanies this distribution.
//
//      The Eclipse Public License is available at
//      http://www.eclipse.org/legal/epl-v10.html
//
//      The Apache License v2.0 is available at
//      http://www.opensource.org/licenses/apache2.0.php
//
//  You may elect to redistribute this code under either of these licenses.
//  ========================================================================
//

package org.eclipse.jetty.websocket.common.util;

import java.lang.reflect.InvocationTargetException;

@SuppressWarnings("serial")
public class DynamicArgsException extends RuntimeException
{
    public DynamicArgsException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public DynamicArgsException(String message)
    {
        super(message);
    }

    public Throwable getInvokedCause()
    {
        Throwable cause = getCause();
        if (cause == null)
            return null;

        if (cause instanceof InvocationTargetException)
        {
            return cause.getCause();
        }
        return cause;
    }
}
