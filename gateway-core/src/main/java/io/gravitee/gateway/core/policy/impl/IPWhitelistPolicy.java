package io.gravitee.gateway.core.policy.impl;

import io.gravitee.gateway.core.policy.PolicyAdapter;

/**
 * @author David BRASSELY (brasseld at gmail.com)
 */
public class IPWhitelistPolicy extends PolicyAdapter {

    @Override
    public String name() {
        return "IP Whitelist";
    }
}