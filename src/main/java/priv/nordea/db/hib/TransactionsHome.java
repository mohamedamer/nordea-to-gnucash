package priv.nordea.db.hib;

// Generated Jun 1, 2013 9:24:39 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import priv.nordea.db.hib.util.HibernateUtil;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Transactions.
 * @see priv.nordea.db.hib.Transactions
 * @author Hibernate Tools
 */
public class TransactionsHome {

	private static final Log log = LogFactory.getLog(TransactionsHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return HibernateUtil.getSessionFactory();
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Transactions transientInstance) {
		log.debug("persisting Transactions instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Transactions instance) {
		log.debug("attaching dirty Transactions instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Transactions instance) {
		log.debug("attaching clean Transactions instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Transactions persistentInstance) {
		log.debug("deleting Transactions instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Transactions merge(Transactions detachedInstance) {
		log.debug("merging Transactions instance");
		try {
			Transactions result = (Transactions) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Transactions findById(java.lang.String id) {
		log.debug("getting Transactions instance with id: " + id);
		try {
			Transactions instance = (Transactions) sessionFactory
					.getCurrentSession().get("priv.nordea.db.hib.Transactions",
							id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	public List<Transactions> findByPostDate(String postDate){
		log.debug("finding Transactions instance by post date");
		try{
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			List<Transactions> result = (List<Transactions>)session.createCriteria(Transactions.class).add(Restrictions.eq("postDate", postDate)).list();
			return result;
		}catch (RuntimeException re){
			log.error("find by post date failed", re);
			throw re;
		}
	}
	public List<Transactions> findByExample(Transactions instance) {
		log.debug("finding Transactions instance by example");
		try {
			List<Transactions> results = (List<Transactions>) sessionFactory
					.getCurrentSession()
					.createCriteria("priv.nordea.db.hib.Transactions")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
