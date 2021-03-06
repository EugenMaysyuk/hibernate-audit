/**
 * Copyright (C) 2009 Krasimir Chobantonov <kchobantonov@yahoo.com>
 * This file is part of Hibernate Audit.
 * <p/>
 * Hibernate Audit is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation; either version 3 of the License, or (at your
 * option) any later version.
 * <p/>
 * Hibernate Audit is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU General Public License along
 * with Hibernate Audit.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.googlecode.hibernate.audit.extension.auditable;

import org.hibernate.Session;
import org.hibernate.boot.Metadata;
import org.hibernate.type.Type;

public interface AuditableInformationProvider {

    boolean isAuditable(String entityName);

    boolean isAuditable(String entityName, String propertyName);

    String getAuditTypeClassName(Metadata metadata, String entityName);

    String getAuditTypeClassName(Metadata metadata, Type type);

    String getEntityName(Metadata metadata, Session session, String auditTypeClassName);
}
