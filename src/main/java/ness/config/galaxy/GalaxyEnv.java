package ness.config.galaxy;

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
