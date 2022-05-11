package map.oneTomany;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args)
	{

		System.out.println( "Hello World!" );
        Configuration config=new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sf=config.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tf=session.beginTransaction();
        
        
        //creating question
        Question q1=new Question();
        q1.setQid(1);
        q1.setQueid("how are  u?");
        
        
        
        //creating answer
        Answer answer=new Answer();
        answer.setAnsId(1);
        answer.setAns(" i am fine");
        answer.setQuestion(q1);
        //creating answer
        Answer answer1=new Answer();
        answer1.setAnsId(2);
        answer1.setAns(" i am good");
        answer1.setQuestion(q1);
        //creating answer
        Answer answer2=new Answer();
        answer2.setAnsId(3);
        answer2.setAns(" i am ok");
        answer2.setQuestion(q1);

        List<Answer>list=new ArrayList <Answer>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);
        
        
        
        q1.setAnswer(list);
        
        
        
        
        session.save(q1);
        session.save(answer);
        session.save(answer1);
        session.save(answer2);
        
        
        tf.commit();
        
        
	}

}
