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

import javax.annotation.Nonnull;

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

    @Nonnull
    public GalaxyIp getInternalIp()
    {
        return internalIp;
    }

    @Nonnull
    public GalaxyIp getExternalIp()
    {
        return externalIp;
    }

    @Nonnull
    public GalaxyDeploy getDeploy()
    {
        return deploy;
    }

    @Nonnull
    public GalaxyEnv getEnv()
    {
        return env;
    }

    @Nonnull
    public GalaxyGlobal getGlobal()
    {
        return global;
    }

    @Nonnull
    public GalaxyPrivate getPrivate()
    {
        return privat;
    }
}
