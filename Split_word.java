public class Split_word{  
	public static void main(String args[]){
		String myself="The sun is a huge ball of gases. It has a diameter of 1,392,000 km. It is so huge that it can hold millions of planets inside it. The Sun is mainly made up of hydrogen and helium gas. The surface of the Sun is known as the photosphere. The photosphere is surrounded by a thin layer of gas known as the chromospheres. Without the Sun, there would be no life on Earth. There would be no plants, no animals and no human beings. As, all the living things on Earth get their energy from the Sun for their survival.";
		String[] words=myself.split("\\s");  
		for(String spl:words){  
		System.out.println(spl);  
	}  
}
}