package ness.config.galaxy;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.nesscomputing.config.Config;

@Singleton
public class GalaxyConfig
{
    private final GalaxyIp internalIp;
    private final GalaxyIp externalIp;
    private final GalaxyDeploy deploy;
    private final GalaxyEnv env;
    private final GalaxyGlobal global;
    private final GalaxyPrivate privat;

    @Inject
    public GalaxyConfig (final Config config)
    {
        this.internalIp = config.getBean("galaxy.internal", GalaxyIp.class);
        this.externalIp = config.getBean("galaxy.external", GalaxyIp.class);
        this.deploy = config.getBean("galaxy.deploy", GalaxyDeploy.class);
        this.env = config.getBean("galaxy.env", GalaxyEnv.class);
        this.global = config.getBean("galaxy.global", GalaxyGlobal.class);
        this.privat = config.getBean("galaxy.private", GalaxyPrivate.class);
    }

    public GalaxyIp getInternalIp()
    {
        return internalIp;
    }

    public GalaxyIp getExternalIp()
    {
        return externalIp;
    }

    public GalaxyDeploy getDeploy()
    {
        return deploy;
    }

    public GalaxyEnv getEnv()
    {
        return env;
    }

    public GalaxyGlobal getGlobal()
    {
        return global;
    }

    public GalaxyPrivate getPrivate()
    {
        return privat;
    }
}
