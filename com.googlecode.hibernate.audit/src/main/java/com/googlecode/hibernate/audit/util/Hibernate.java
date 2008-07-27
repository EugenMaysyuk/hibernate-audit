package com.googlecode.hibernate.audit.util;

import org.hibernate.type.CollectionType;
import org.hibernate.type.BagType;

import java.util.List;

/**
 * @author <a href="mailto:ovidiu@feodorov.com">Ovidiu Feodorov</a>
 *
 * Copyright 2008 Ovidiu Feodorov
 *
 * @version <tt>$Revision$</tt>
 *
 * $Id$
 */
public class Hibernate
{
    // Constants -----------------------------------------------------------------------------------

    // Static --------------------------------------------------------------------------------------

    public static Class collectionTypeToClass(CollectionType ct)
    {
        if (ct instanceof BagType)
        {
            // this is hibernate's unordered collection that accepts duplicates, we use list
            return List.class;
        }

        throw new RuntimeException("we don't know to translate " + ct);
    }

    // Attributes ----------------------------------------------------------------------------------

    // Constructors --------------------------------------------------------------------------------

    // Public --------------------------------------------------------------------------------------

    // Package protected ---------------------------------------------------------------------------

    // Protected -----------------------------------------------------------------------------------

    // Private -------------------------------------------------------------------------------------

    // Inner classes -------------------------------------------------------------------------------
}
