
class Consonant
{
  
static String alterString(char[] s)
    {
     
        for (int i = 0; i < s.length; i++)
        {
            if (!isVowel(s[i]))
            {
 
                if (s[i] == 'z')
                {
                    s[i] = 'b';
                }
                 
                else
                {
                    s[i] = (char) (s[i] + 1);
 
                    if (isVowel(s[i]))
                    {
                        s[i] = (char) (s[i] + 1);
                    }
                }
            }
        }
        return String.valueOf(s);
    }
 
     

 static boolean isVowel(char ch)
    {
        if (ch != 'a' && ch != 'e' && ch != 'i'
                && ch != 'o' && ch != 'u')
        {
            return false;
        }
        return true;
    }

 
 public static void main(String[] args)
    {
        String s = "Jay";
        System.out.println(alterString(s.toCharArray()));
    }
}