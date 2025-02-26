import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static void swap(ArrayList<String> arrL, int num, int num2){
		String word= arrL.get(num);
		arrL.set(num, arrL.get(num2));
		arrL.set(num2, word);
	} 
	public static ArrayList<Double> createArrayList(double[] arr){
		ArrayList<Double> arrl= new ArrayList<Double>();
		for (int i=0;i<arr.length;i++){
			arrl.add(arr[i]);
		}
		return arrl;
	}
	public static HashMap<String, Integer> combineParallelArrays(String[] name, int[] age){
		HashMap<String, Integer> map=  new HashMap<String, Integer>();
		for (int i=0; i< name.length; i++){
			map.put(name[i],age[i]);
		}
		return map;
	}
	public static void increaseAge( HashMap<String,Integer> map, String name){
		map.put(name, map.get(name)+1);
	}

}
