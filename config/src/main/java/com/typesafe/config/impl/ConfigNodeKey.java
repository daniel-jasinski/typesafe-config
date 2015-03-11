package com.typesafe.config.impl;

import java.util.Collection;
import java.util.Collections;

final class ConfigNodeKey extends AbstractConfigNode {
    Token token;
    ConfigNodeKey(Token t) {
        token = t;
    }

    protected Collection<Token> tokens() {
        return Collections.singletonList(token);
    }
}
