/*
 * This file is generated by jOOQ.
 */
package com.devstronomy.jooq.generated;


import com.devstronomy.jooq.generated.tables.Planet;
import com.devstronomy.jooq.generated.tables.Satellite;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>devstronomy</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index PLANET_PRIMARY = Indexes0.PLANET_PRIMARY;
    public static final Index SATELLITE_PLANET_ID = Indexes0.SATELLITE_PLANET_ID;
    public static final Index SATELLITE_PRIMARY = Indexes0.SATELLITE_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index PLANET_PRIMARY = Internal.createIndex("PRIMARY", Planet.PLANET, new OrderField[] { Planet.PLANET.ID }, true);
        public static Index SATELLITE_PLANET_ID = Internal.createIndex("planet_id", Satellite.SATELLITE, new OrderField[] { Satellite.SATELLITE.PLANET_ID }, false);
        public static Index SATELLITE_PRIMARY = Internal.createIndex("PRIMARY", Satellite.SATELLITE, new OrderField[] { Satellite.SATELLITE.ID }, true);
    }
}
