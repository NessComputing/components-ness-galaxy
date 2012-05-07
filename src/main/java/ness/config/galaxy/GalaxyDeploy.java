package ness.config.galaxy;

import org.skife.config.Config;
import org.skife.config.DefaultNull;

/**
 * Represents the deployment information from the galaxy system properties.
 */
public abstract class GalaxyDeploy
{
    @Config("env")
    @DefaultNull
    public String getEnv()
    {
        return null;
    }

    @Config("version")
    @DefaultNull
    public String getVersion()
    {
        return null;
    }

    @Config("type")
    @DefaultNull
    public String getType()
    {
        return null;
    }

    @Config("config")
    @DefaultNull
    public String getConfig()
    {
        return null;
    }
}
