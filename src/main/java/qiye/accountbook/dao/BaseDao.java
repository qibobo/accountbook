package qiye.accountbook.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BaseDao<T> extends SqlSessionDaoSupport {
	@Autowired  
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){           
        super.setSqlSessionFactory(sqlSessionFactory);  
    }  
	public SqlSession openSession() {
		try {
			SqlSession session = getSqlSession();
			return session;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public T selectOne(String sql) {
		SqlSession session = this.openSession();
		return session.selectOne(sql);

	}

	public T selectOne(String sql, Object paramObject) {
		SqlSession session = this.openSession();
		return session.selectOne(sql, paramObject);

	}

	public List<T> selectList(String sql) {
		SqlSession session = this.openSession();
		return session.selectList(sql);
	}

	public List<T> selectList(String sql, Object paramObject) {
		SqlSession session = this.openSession();
		return session.selectList(sql, paramObject);

	}

	public Integer selectCount(String sql) {
		SqlSession session = this.openSession();
		return (Integer) session.selectOne(sql);

	}

	public Integer insert(String sql, Object paramObject) {
		SqlSession session = this.openSession();
		return session.insert(sql, paramObject);

	}

	public Integer update(String sql, Object paramObject) {
		SqlSession session = this.openSession();
		return session.update(sql, paramObject);
	}

	public Integer update(String sql) {
		SqlSession session = this.openSession();
		return session.update(sql);
	}

	public Integer delete(String sql, Object paramObject) {
		SqlSession session = this.openSession();
		return session.delete(sql, paramObject);
	}

	public Integer delete(String sql) {
		SqlSession session = this.openSession();
		return session.delete(sql);
	}

	public Integer updateOne(String sql, Object paramObject) throws Exception {
		SqlSession session = this.openSession();
		int count = session.update(sql, paramObject);
		if (count == 1) {
			session.commit();
			return count;
		} else {
			session.rollback();
			throw new Exception("Expect update one row but more than one row is updated");
		}

	}

	public Integer updateOne(String sql) throws Exception {
		SqlSession session = this.openSession();
		int count = session.update(sql);
		if (count == 1) {
			session.commit();
			return count;
		} else {
			session.rollback();
			throw new Exception("Expect update one row but more than one row is updated");
		}
	}

	public Integer deleteOne(String sql, Object paramObject) throws Exception {
		SqlSession session = this.openSession();
		int count = session.delete(sql, paramObject);
		if (count == 1) {
			session.commit();
			return count;
		} else {
			session.rollback();
			throw new Exception("Expect update one row but more than one row is updated");
		}
	}

	public Integer deleteOne(String sql) throws Exception {
		SqlSession session = this.openSession();
		int count = session.delete(sql);
		if (count == 1) {
			session.commit();
			return count;
		} else {
			session.rollback();
			throw new Exception("Expect update one row but more than one row is updated");
		}

	}

}
