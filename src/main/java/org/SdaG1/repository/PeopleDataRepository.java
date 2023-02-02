package org.SdaG1.repository;

import org.SdaG1.model.People;
import org.SdaG1.model.PeopleInSpaceData;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class PeopleDataRepository implements IssRepository<PeopleInSpaceData>{

    private SessionFactory sessionFactory;

    public PeopleDataRepository(){
        initConnection();
    }

    private void initConnection() {
        sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(PeopleInSpaceData.class)
                .buildSessionFactory();
    }

    @Override
    public void save(PeopleInSpaceData peopleInspaceData) {
        Transaction transaction = null;
        try (Session session = sessionFactory.getCurrentSession()) { // try-with-resources - umieszczamy tu zasoby "zamykalne" - implementujące "Closable()" - nie trzeba juz zamykac sesji
            transaction = session.beginTransaction();
            session.save(peopleInspaceData);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction!=null){
                transaction.rollback();
            }
        }
    }

    @Override
    public List<People> getListOfPeopleInSpace() {
        return null;
    }
}
