package ness.config.galaxy;

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
