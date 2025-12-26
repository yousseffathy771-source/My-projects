package Quiz;

public class StudentAnswer {
    private Question question;  
    private String studentAnswer;
    private boolean isCorrect;

    public StudentAnswer(Question question, String studentAnswer, boolean isCorrect) {
        this.question = question;
        this.studentAnswer = studentAnswer;
        this.isCorrect = isCorrect;
    }
    
    public StudentAnswer() {
        
    }
    
    public boolean isCorrect() {
        return isCorrect;
    }

    public String getQuestionId() {
        return question != null ? question.getQuestionId() : null;
    }

    public String getStudentAnswer() {
        return studentAnswer;
    }
    
  
    public Question getQuestion() {
        return question;
    }
    
    public void setQuestion(Question question) {
        this.question = question;
    }
    
    public void setStudentAnswer(String studentAnswer) {
        this.studentAnswer = studentAnswer;
    }
    
    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
}