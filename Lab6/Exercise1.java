import java.util.*;

class Exercise1
{
	public static List<String> getValues(HashMap<Integer,String> map)
	{
		List<String> list = new ArrayList<>(map.values());
		Collections.sort(list);
		return list;
	}
	
	public static void main(String args[])
	{
		HashMap<Integer,String> map = new HashMap<>();
		
		map.put(3,"abc");
		map.put(2,"xyz");
		map.put(1,"pqr");
		map.put(4,"lmn");

		List<String> list = getValues(map);
	
		System.out.println(list);
	}
}