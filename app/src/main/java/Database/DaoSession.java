package Database;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import Database.Tree;
import Database.Bench;
import Database.Bathroom;
import Database.Fountain;

import Database.TreeDao;
import Database.BenchDao;
import Database.BathroomDao;
import Database.FountainDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig treeDaoConfig;
    private final DaoConfig benchDaoConfig;
    private final DaoConfig bathroomDaoConfig;
    private final DaoConfig fountainDaoConfig;

    private final TreeDao treeDao;
    private final BenchDao benchDao;
    private final BathroomDao bathroomDao;
    private final FountainDao fountainDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        treeDaoConfig = daoConfigMap.get(TreeDao.class).clone();
        treeDaoConfig.initIdentityScope(type);

        benchDaoConfig = daoConfigMap.get(BenchDao.class).clone();
        benchDaoConfig.initIdentityScope(type);

        bathroomDaoConfig = daoConfigMap.get(BathroomDao.class).clone();
        bathroomDaoConfig.initIdentityScope(type);

        fountainDaoConfig = daoConfigMap.get(FountainDao.class).clone();
        fountainDaoConfig.initIdentityScope(type);

        treeDao = new TreeDao(treeDaoConfig, this);
        benchDao = new BenchDao(benchDaoConfig, this);
        bathroomDao = new BathroomDao(bathroomDaoConfig, this);
        fountainDao = new FountainDao(fountainDaoConfig, this);

        registerDao(Tree.class, treeDao);
        registerDao(Bench.class, benchDao);
        registerDao(Bathroom.class, bathroomDao);
        registerDao(Fountain.class, fountainDao);
    }
    
    public void clear() {
        treeDaoConfig.clearIdentityScope();
        benchDaoConfig.clearIdentityScope();
        bathroomDaoConfig.clearIdentityScope();
        fountainDaoConfig.clearIdentityScope();
    }

    public TreeDao getTreeDao() {
        return treeDao;
    }

    public BenchDao getBenchDao() {
        return benchDao;
    }

    public BathroomDao getBathroomDao() {
        return bathroomDao;
    }

    public FountainDao getFountainDao() {
        return fountainDao;
    }

}