package Database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BATHROOM".
*/
public class BathroomDao extends AbstractDao<Bathroom, Long> {

    public static final String TABLENAME = "BATHROOM";

    /**
     * Properties of entity Bathroom.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Latitude = new Property(1, Double.class, "latitude", false, "LATITUDE");
        public final static Property Longitude = new Property(2, Double.class, "longitude", false, "LONGITUDE");
    }


    public BathroomDao(DaoConfig config) {
        super(config);
    }
    
    public BathroomDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BATHROOM\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"LATITUDE\" REAL," + // 1: latitude
                "\"LONGITUDE\" REAL);"); // 2: longitude
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BATHROOM\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Bathroom entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Double latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindDouble(2, latitude);
        }
 
        Double longitude = entity.getLongitude();
        if (longitude != null) {
            stmt.bindDouble(3, longitude);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Bathroom entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Double latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindDouble(2, latitude);
        }
 
        Double longitude = entity.getLongitude();
        if (longitude != null) {
            stmt.bindDouble(3, longitude);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Bathroom readEntity(Cursor cursor, int offset) {
        Bathroom entity = new Bathroom( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getDouble(offset + 1), // latitude
            cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2) // longitude
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Bathroom entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLatitude(cursor.isNull(offset + 1) ? null : cursor.getDouble(offset + 1));
        entity.setLongitude(cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Bathroom entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Bathroom entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Bathroom entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
