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
 * Represents deployment private information from the galaxy system properties.
 */
public abstract class GalaxyPrivate
{
    @Config("port.jmx")
    @Default("12345")
    public int getPortJmx()
    {
        return 12345;
    }

    @Config("port.tomcat")
    @Default("8005")
    public int getPortTomcat()
    {
        return 8005;
    }

    @Config("port.0")
    @Default("28800")
    public int getPort0()
    {
        return 28800;
    }

    @Config("port.1")
    @Default("28801")
    public int getPort1()
    {
        return 28801;
    }

    @Config("port.2")
    @Default("28802")
    public int getPort2()
    {
        return 28802;
    }

    @Config("port.3")
    @Default("28803")
    public int getPort3()
    {
        return 28803;
    }

    @Config("port.4")
    @Default("28804")
    public int getPort4()
    {
        return 28804;
    }
}
