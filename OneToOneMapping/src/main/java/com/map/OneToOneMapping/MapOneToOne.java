package com.map.OneToOneMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class MapOneToOne {

    public static void main( String[] args ) {
    	SessionFactory factory=new Configuration().configure().buildSessionFactory();
    	Session ses=factory.getCurrentSession();
    	Transaction tx=null;
    	
    	
    	try {
    		// answer object
    		Answer ans=new Answer();
    		ans.setAnswerId(101);
    		ans.setAnswer("Cascading Style sheet");
    		
    		//Question object
    		Question que=new Question();
    		que.setQuestionID(2);
    		que.setQuestionName("CSS stands for?");
    		que.setAnswer(ans);
    		
    		
    		ans.setQue_Id(que);
    		
    		ses=factory.openSession();
    		tx=ses.beginTransaction();
    		
    		ses.save(que);
    		ses.save(que);
    		tx.commit();
    		
    	
    	}
}
}

    
    


