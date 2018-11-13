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
 * DAO for table "SALE_PAY_MODE".
*/
public class SalePayModeDao extends AbstractDao<SalePayMode, Long> {

    public static final String TABLENAME = "SALE_PAY_MODE";

    /**
     * Properties of entity SalePayMode.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Braid = new Property(1, String.class, "Braid", false, "BRAID");
        public final static Property SaleDate = new Property(2, java.util.Date.class, "SaleDate", false, "SALE_DATE");
        public final static Property SaleId = new Property(3, String.class, "SaleId", false, "SALE_ID");
        public final static Property SalerId = new Property(4, String.class, "SalerId", false, "SALER_ID");
        public final static Property PayModeId = new Property(5, String.class, "PayModeId", false, "PAY_MODE_ID");
        public final static Property PayMoney = new Property(6, Double.class, "PayMoney", false, "PAY_MONEY");
        public final static Property CardType = new Property(7, String.class, "CardType", false, "CARD_TYPE");
        public final static Property CardNo = new Property(8, String.class, "CardNo", false, "CARD_NO");
        public final static Property SourceId = new Property(9, Long.class, "SourceId", false, "SOURCE_ID");
        public final static Property IsReturn = new Property(10, Boolean.class, "IsReturn", false, "IS_RETURN");
        public final static Property OrderInnerId = new Property(11, String.class, "OrderInnerId", false, "ORDER_INNER_ID");
    }


    public SalePayModeDao(DaoConfig config) {
        super(config);
    }
    
    public SalePayModeDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SALE_PAY_MODE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"BRAID\" TEXT," + // 1: Braid
                "\"SALE_DATE\" INTEGER," + // 2: SaleDate
                "\"SALE_ID\" TEXT," + // 3: SaleId
                "\"SALER_ID\" TEXT," + // 4: SalerId
                "\"PAY_MODE_ID\" TEXT," + // 5: PayModeId
                "\"PAY_MONEY\" REAL," + // 6: PayMoney
                "\"CARD_TYPE\" TEXT," + // 7: CardType
                "\"CARD_NO\" TEXT," + // 8: CardNo
                "\"SOURCE_ID\" INTEGER," + // 9: SourceId
                "\"IS_RETURN\" INTEGER," + // 10: IsReturn
                "\"ORDER_INNER_ID\" TEXT);"); // 11: OrderInnerId
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SALE_PAY_MODE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, SalePayMode entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String Braid = entity.getBraid();
        if (Braid != null) {
            stmt.bindString(2, Braid);
        }
 
        java.util.Date SaleDate = entity.getSaleDate();
        if (SaleDate != null) {
            stmt.bindLong(3, SaleDate.getTime());
        }
 
        String SaleId = entity.getSaleId();
        if (SaleId != null) {
            stmt.bindString(4, SaleId);
        }
 
        String SalerId = entity.getSalerId();
        if (SalerId != null) {
            stmt.bindString(5, SalerId);
        }
 
        String PayModeId = entity.getPayModeId();
        if (PayModeId != null) {
            stmt.bindString(6, PayModeId);
        }
 
        Double PayMoney = entity.getPayMoney();
        if (PayMoney != null) {
            stmt.bindDouble(7, PayMoney);
        }
 
        String CardType = entity.getCardType();
        if (CardType != null) {
            stmt.bindString(8, CardType);
        }
 
        String CardNo = entity.getCardNo();
        if (CardNo != null) {
            stmt.bindString(9, CardNo);
        }
 
        Long SourceId = entity.getSourceId();
        if (SourceId != null) {
            stmt.bindLong(10, SourceId);
        }
 
        Boolean IsReturn = entity.getIsReturn();
        if (IsReturn != null) {
            stmt.bindLong(11, IsReturn ? 1L: 0L);
        }
 
        String OrderInnerId = entity.getOrderInnerId();
        if (OrderInnerId != null) {
            stmt.bindString(12, OrderInnerId);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, SalePayMode entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String Braid = entity.getBraid();
        if (Braid != null) {
            stmt.bindString(2, Braid);
        }
 
        java.util.Date SaleDate = entity.getSaleDate();
        if (SaleDate != null) {
            stmt.bindLong(3, SaleDate.getTime());
        }
 
        String SaleId = entity.getSaleId();
        if (SaleId != null) {
            stmt.bindString(4, SaleId);
        }
 
        String SalerId = entity.getSalerId();
        if (SalerId != null) {
            stmt.bindString(5, SalerId);
        }
 
        String PayModeId = entity.getPayModeId();
        if (PayModeId != null) {
            stmt.bindString(6, PayModeId);
        }
 
        Double PayMoney = entity.getPayMoney();
        if (PayMoney != null) {
            stmt.bindDouble(7, PayMoney);
        }
 
        String CardType = entity.getCardType();
        if (CardType != null) {
            stmt.bindString(8, CardType);
        }
 
        String CardNo = entity.getCardNo();
        if (CardNo != null) {
            stmt.bindString(9, CardNo);
        }
 
        Long SourceId = entity.getSourceId();
        if (SourceId != null) {
            stmt.bindLong(10, SourceId);
        }
 
        Boolean IsReturn = entity.getIsReturn();
        if (IsReturn != null) {
            stmt.bindLong(11, IsReturn ? 1L: 0L);
        }
 
        String OrderInnerId = entity.getOrderInnerId();
        if (OrderInnerId != null) {
            stmt.bindString(12, OrderInnerId);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public SalePayMode readEntity(Cursor cursor, int offset) {
        SalePayMode entity = new SalePayMode( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // Braid
            cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)), // SaleDate
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // SaleId
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // SalerId
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // PayModeId
            cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6), // PayMoney
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // CardType
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // CardNo
            cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9), // SourceId
            cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0, // IsReturn
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11) // OrderInnerId
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, SalePayMode entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBraid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setSaleDate(cursor.isNull(offset + 2) ? null : new java.util.Date(cursor.getLong(offset + 2)));
        entity.setSaleId(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSalerId(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPayModeId(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setPayMoney(cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6));
        entity.setCardType(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCardNo(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setSourceId(cursor.isNull(offset + 9) ? null : cursor.getLong(offset + 9));
        entity.setIsReturn(cursor.isNull(offset + 10) ? null : cursor.getShort(offset + 10) != 0);
        entity.setOrderInnerId(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(SalePayMode entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(SalePayMode entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(SalePayMode entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
