package ness.config.galaxy;

import org.skife.config.Config;
import org.skife.config.Default;

/**
 * Represents deployment global information from the galaxy system properties.
 */
public abstract class GalaxyGlobal
{
    @Config("port.0")
    @Default("28805")
    public int getPort0()
    {
        return 28805;
    }

    @Config("port.1")
    @Default("28806")
    public int getPort1()
    {
        return 28806;
    }

    @Config("port.2")
    @Default("28807")
    public int getPort2()
    {
        return 28807;
    }

    @Config("port.3")
    @Default("28808")
    public int getPort3()
    {
        return 28808;
    }

    @Config("port.4")
    @Default("28809")
    public int getPort4()
    {
        return 28809;
    }
}
