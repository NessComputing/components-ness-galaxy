package com.nesscomputing.galaxy;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

/**
 * Provides the Galaxy configuration object to a service.
 */
public class GalaxyConfigModule extends AbstractModule
{
    @Override
    public void configure()
    {
        bind(GalaxyConfig.class).in(Scopes.SINGLETON);
    }
}
