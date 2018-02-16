package com.novoda.buildproperties

interface Entries {

    boolean contains(String key)

    Entry getAt(String key)

    Enumeration<String> getKeys()

    interface Factory {

        Entries from(def source)
    }
}
