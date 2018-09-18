package personal.wl.jspos.pos;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "POS_MACHINE".
*/
public class PosMachineDao extends AbstractDao<PosMachine, Long> {

    public static final String TABLENAME = "POS_MACHINE";

    /**
     * Properties of entity PosMachine.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Braid = new Property(1, String.class, "braid", false, "BRAID");
        public final static Property Posno = new Property(2, String.class, "posno", false, "POSNO");
        public final static Property Status = new Property(3, String.class, "Status", false, "STATUS");
    }


    public PosMachineDao(DaoConfig config) {
        super(config);
    }
    
    public PosMachineDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"POS_MACHINE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"BRAID\" TEXT," + // 1: braid
                "\"POSNO\" TEXT," + // 2: posno
                "\"STATUS\" TEXT);"); // 3: Status
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"POS_MACHINE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, PosMachine entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String braid = entity.getBraid();
        if (braid != null) {
            stmt.bindString(2, braid);
        }
 
        String posno = entity.getPosno();
        if (posno != null) {
            stmt.bindString(3, posno);
        }
 
        String Status = entity.getStatus();
        if (Status != null) {
            stmt.bindString(4, Status);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, PosMachine entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String braid = entity.getBraid();
        if (braid != null) {
            stmt.bindString(2, braid);
        }
 
        String posno = entity.getPosno();
        if (posno != null) {
            stmt.bindString(3, posno);
        }
 
        String Status = entity.getStatus();
        if (Status != null) {
            stmt.bindString(4, Status);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public PosMachine readEntity(Cursor cursor, int offset) {
        PosMachine entity = new PosMachine( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // braid
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // posno
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3) // Status
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, PosMachine entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBraid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPosno(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setStatus(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(PosMachine entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(PosMachine entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(PosMachine entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}