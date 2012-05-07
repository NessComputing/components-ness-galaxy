package ness.config.galaxy;

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
