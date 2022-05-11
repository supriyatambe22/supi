package map.oneTomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@ Id
	private int ansId;
	
@Column
private String ans;
@ManyToOne
private Question question;
public int getAnsId() {
	return ansId;
}
public void setAnsId(int ansId) {
	this.ansId = ansId;
}
public String getAns() {
	return ans;
}
public void setAns(String ans) {
	this.ans = ans;
}
public Question getQuestion() {
	return question;
}
public void setQuestion(Question question) {
	this.question = question;
}
public Answer(int ansId, String ans, Question question) {
	super();
	this.ansId = ansId;
	this.ans = ans;
	this.question = question;
}
public Answer() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Answer [ansId=" + ansId + ", ans=" + ans + ", question=" + question + "]";
}



}
