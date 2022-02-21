import java.util.*;

class Exercise2
{
	public static Map<Character,Integer> countChars(char arr[])
	{
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				Integer a = map.get(arr[i]);
				map.put(arr[i],++a);
			}
			else
			{
				map.put(arr[i],1);
			}
		}
		return map;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array length :");
		
		char arr[] = sc.next().toCharArray();

		Map<Character,Integer> map = countChars(arr);
		System.out.println(map);
	}
}

/*    import java.util.*;

public class Exercise27
{
   
  public static void main(String args[]) 
  {
      
  String input = "MaharashtraIsMyState";
  char search = 'a';             
  
  Map<Character,Integer> hash = new HashMap<Character,Integer>();
  
  for(int i=0;i<input.length();i++)
  {
      if(hash.containsKey(input.charAt(i)))
      hash.put(input.charAt(i), hash.get(input.charAt(i))+1);
      
      else
      hash.put(input.charAt(i), 1);
  }
  
  int result = hash.get(search);
  
  System.out.println("The Character:'"+search+"' are appears "+result+" times.");
  }
}  
*/