/**
 * Copyright (C) 2012 Ness Computing, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nesscomputing.galaxy;

import org.skife.config.Config;
import org.skife.config.Default;


/**
 * Represents a set of IP information from the galaxy system properties.
 * Defaults are set so that a test server can be spun up with out any config.
 */
public abstract class GalaxyIp
{
    @SuppressWarnings("PMD.AvoidUsingHardCodedIP")
    @Config("ip")
    @Default("127.0.0.1")
    public String getIp()
    {
        return "127.0.0.1";
    }

    @Config("port.http")
    @Default("8080")
    public int getHttpPort()
    {
        return 8080;
    }

    @Config("port.https")
    @Default("8443")
    public int getHttpsPort()
    {
        return 8443;
    }
}
