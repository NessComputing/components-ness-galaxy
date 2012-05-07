package ness.config.galaxy;

import com.google.inject.AbstractModule;

/**
 * Provides the Galaxy configuration object to a service.
 */
public class GalaxyConfigModule extends AbstractModule
{
    @Override
    public void configure()
    {
        bind(GalaxyConfig.class);
    }
}
