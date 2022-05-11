package map.oneTomany;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Question {
	@Id
	private int qid;
	
	@Column
	 private String queid;
	
	@OneToMany (mappedBy="question")
	 
	private List<Answer> answer;

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQueid() {
		return queid;
	}

	public void setQueid(String queid) {
		this.queid = queid;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public Question(int qid, String queid, List<Answer> answer) {
		super();
		this.qid = qid;
		this.queid = queid;
		this.answer = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", queid=" + queid + ", answer=" + answer + "]";
	}

}
