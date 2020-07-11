package topic2.assi2;

public class Document {

	private String text = "";
	
	Document(String text){
		this.text = text;
	}
	
	public String toString(){
		return text;
	}
	
	
	public void setText(String text){
		this.text = text;
	}
	
}
