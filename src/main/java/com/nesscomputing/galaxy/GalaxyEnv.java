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
import org.skife.config.DefaultNull;

/**
 * Represents the environment information from the galaxy system properties.
 */
public abstract class GalaxyEnv
{
    @Config("base")
    @DefaultNull
    public String getBase()
    {
        return null;
    }

    @Config("repository")
    @DefaultNull
    public String getRepository()
    {
        return null;
    }

    @Config("binaries")
    @DefaultNull
    public String getBinaries()
    {
        return null;
    }

    @Config("agent_id")
    @DefaultNull
    public String getAgentId()
    {
        return null;
    }

    @Config("agent_group")
    @DefaultNull
    public String getAgentGroup()
    {
        return null;
    }

    @Config("machine")
    @DefaultNull
    public String getMachine()
    {
        return null;
    }

    @Config("slot_info")
    @DefaultNull
    public String getSlotInfo()
    {
        return null;
    }

    @Config("config_location")
    @DefaultNull
    public String getConfigLocation()
    {
        return null;
    }
}
