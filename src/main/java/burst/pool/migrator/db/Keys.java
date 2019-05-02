/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.db;


import burst.pool.migrator.db.tables.Bestsubmissions;
import burst.pool.migrator.db.tables.FlywaySchemaHistory;
import burst.pool.migrator.db.tables.Minerdeadlines;
import burst.pool.migrator.db.tables.Miners;
import burst.pool.migrator.db.tables.Payouts;
import burst.pool.migrator.db.tables.Poolstate;
import burst.pool.migrator.db.tables.Wonblocks;
import burst.pool.migrator.db.tables.records.BestsubmissionsRecord;
import burst.pool.migrator.db.tables.records.FlywaySchemaHistoryRecord;
import burst.pool.migrator.db.tables.records.MinerdeadlinesRecord;
import burst.pool.migrator.db.tables.records.MinersRecord;
import burst.pool.migrator.db.tables.records.PayoutsRecord;
import burst.pool.migrator.db.tables.records.PoolstateRecord;
import burst.pool.migrator.db.tables.records.WonblocksRecord;

import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>pooldb</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<BestsubmissionsRecord, Long> IDENTITY_BESTSUBMISSIONS = Identities0.IDENTITY_BESTSUBMISSIONS;
    public static final Identity<MinerdeadlinesRecord, Long> IDENTITY_MINERDEADLINES = Identities0.IDENTITY_MINERDEADLINES;
    public static final Identity<MinersRecord, Long> IDENTITY_MINERS = Identities0.IDENTITY_MINERS;
    public static final Identity<PayoutsRecord, Long> IDENTITY_PAYOUTS = Identities0.IDENTITY_PAYOUTS;
    public static final Identity<WonblocksRecord, Long> IDENTITY_WONBLOCKS = Identities0.IDENTITY_WONBLOCKS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BestsubmissionsRecord> KEY_BESTSUBMISSIONS_PRIMARY = UniqueKeys0.KEY_BESTSUBMISSIONS_PRIMARY;
    public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = UniqueKeys0.KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY;
    public static final UniqueKey<MinerdeadlinesRecord> KEY_MINERDEADLINES_PRIMARY = UniqueKeys0.KEY_MINERDEADLINES_PRIMARY;
    public static final UniqueKey<MinersRecord> KEY_MINERS_PRIMARY = UniqueKeys0.KEY_MINERS_PRIMARY;
    public static final UniqueKey<PayoutsRecord> KEY_PAYOUTS_PRIMARY = UniqueKeys0.KEY_PAYOUTS_PRIMARY;
    public static final UniqueKey<PoolstateRecord> KEY_POOLSTATE_PRIMARY = UniqueKeys0.KEY_POOLSTATE_PRIMARY;
    public static final UniqueKey<WonblocksRecord> KEY_WONBLOCKS_PRIMARY = UniqueKeys0.KEY_WONBLOCKS_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<BestsubmissionsRecord, Long> IDENTITY_BESTSUBMISSIONS = Internal.createIdentity(Bestsubmissions.BESTSUBMISSIONS, Bestsubmissions.BESTSUBMISSIONS.DB_ID);
        public static Identity<MinerdeadlinesRecord, Long> IDENTITY_MINERDEADLINES = Internal.createIdentity(Minerdeadlines.MINERDEADLINES, Minerdeadlines.MINERDEADLINES.DB_ID);
        public static Identity<MinersRecord, Long> IDENTITY_MINERS = Internal.createIdentity(Miners.MINERS, Miners.MINERS.DB_ID);
        public static Identity<PayoutsRecord, Long> IDENTITY_PAYOUTS = Internal.createIdentity(Payouts.PAYOUTS, Payouts.PAYOUTS.DB_ID);
        public static Identity<WonblocksRecord, Long> IDENTITY_WONBLOCKS = Internal.createIdentity(Wonblocks.WONBLOCKS, Wonblocks.WONBLOCKS.DB_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<BestsubmissionsRecord> KEY_BESTSUBMISSIONS_PRIMARY = Internal.createUniqueKey(Bestsubmissions.BESTSUBMISSIONS, "KEY_bestsubmissions_PRIMARY", Bestsubmissions.BESTSUBMISSIONS.DB_ID);
        public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "KEY_flyway_schema_history_PRIMARY", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<MinerdeadlinesRecord> KEY_MINERDEADLINES_PRIMARY = Internal.createUniqueKey(Minerdeadlines.MINERDEADLINES, "KEY_minerdeadlines_PRIMARY", Minerdeadlines.MINERDEADLINES.DB_ID);
        public static final UniqueKey<MinersRecord> KEY_MINERS_PRIMARY = Internal.createUniqueKey(Miners.MINERS, "KEY_miners_PRIMARY", Miners.MINERS.DB_ID);
        public static final UniqueKey<PayoutsRecord> KEY_PAYOUTS_PRIMARY = Internal.createUniqueKey(Payouts.PAYOUTS, "KEY_payouts_PRIMARY", Payouts.PAYOUTS.DB_ID);
        public static final UniqueKey<PoolstateRecord> KEY_POOLSTATE_PRIMARY = Internal.createUniqueKey(Poolstate.POOLSTATE, "KEY_poolstate_PRIMARY", Poolstate.POOLSTATE.KEY);
        public static final UniqueKey<WonblocksRecord> KEY_WONBLOCKS_PRIMARY = Internal.createUniqueKey(Wonblocks.WONBLOCKS, "KEY_wonblocks_PRIMARY", Wonblocks.WONBLOCKS.DB_ID);
    }
}