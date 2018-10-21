package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String s = new String(new char[1001]);
		  char c;
		  int i;
		  int n = 1;
		  s = new Scanner(System.in).nextLine();
		  for (i = 0;(s.charAt(i)) != '\0';i++)
		  {
		   if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
		   {
		   s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a'+'A');
		   }
		  }
		  for (i = 0;(s.charAt(i)) != '\0';i++)
		  {
			if (s.charAt(i) == s.charAt(i + 1))
			{
			   n = n + 1;
			}
			else
			{
			System.out.printf("(%c,%d)",s.charAt(i),n);
			n = 1;
			}
		  }
	}





}

