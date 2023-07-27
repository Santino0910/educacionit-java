package ej1;

import java.util.ArrayList;

public class Jsonify {

	public static void main(String[] args) {
		ArrayList<String> json = new ArrayList<>();
		for(int i = 0;i<args.length;i++){
			json.add('"'+args[i]+'"');
		}
		System.out.println("{\"Data\": "+json+"}");
	}
}
