package javaPgm.day13;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StoreCharInListAdIndexInSet {
	

public static void main(String[] args) {
		String input = "Welcome to the java world";
		String lowerCase = input.toLowerCase();
		char[] charArr = lowerCase.toCharArray();
		
		List<String> listFrChars= new ArrayList<String>();
		List<Integer> list= new ArrayList<Integer>();
		
		for(char Chr:charArr) {
			String eachChr = Character.toString(Chr);
			if(!eachChr.contains(" ")) {
			listFrChars.add(eachChr);
			}
		}
		System.out.println("list of characters with duplicates: " +listFrChars);
		List<Integer> setForIndex= new ArrayList<Integer>();
		int index = 0;
		for(int i=0;i<input.length();i++) {
			if(!(input.substring(i, i+1)).equals(" ")) {
				setForIndex.add(input.indexOf(input.substring(i, i+1),index));
			}
			index++;
		}
		System.out.println("set with indexes: "+setForIndex);
		list.addAll(setForIndex);
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		for(int i=0;i<listFrChars.size();i++) {
			map.put(list.get(i), listFrChars.get(i));
		}
		System.out.println("Index for the each characters:\n"+map.entrySet());
		
				
		for(int i = 0 ; i<listFrChars.size();i++) {
			{
				for(int j = i+1;j<listFrChars.size();j++) {
					if((listFrChars.get(i)).equals(listFrChars.get(j))) {
						listFrChars.remove(j);
					}
				}
			}
			
		}
		System.out.println("list of characters without duplicates: " +listFrChars);
		
		
		}

}
