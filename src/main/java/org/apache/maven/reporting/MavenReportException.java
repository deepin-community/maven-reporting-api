package org.apache.maven.reporting;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/**
 * An exception occurring during the execution of a Maven report.
 *
 * @author Brett Porter
 * @author <a href="evenisse@apache.org">Emmanuel Venisse</a>
 * @version $Id: MavenReportException.java 942378 2010-05-08 13:06:13Z hboutemy $
 * @since 2.0
 */
public class MavenReportException
    extends Exception
{
    /** The serialVersionUID **/
    public static final long serialVersionUID = -6200353563231163785L;

    /**
     * Default constructor.
     *
     * @param msg the exception message.
     */
    public MavenReportException( String msg )
    {
        super( msg );
    }

    /**
     * Other constructor.
     *
     * @param msg the exception message.
     * @param cause the cause.
     */
    public MavenReportException( String msg, Exception cause )
    {
        super( msg, cause );
    }
}
