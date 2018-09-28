package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String ch = new String(new char[200]);
	   String s = new String(new char[200]);
	   int m;
	   int i;
	   int j = 0;
	   int word = 0;
	   ch = new Scanner(System.in).nextLine();
	   m = ch.length();
	   for (i = 0;i < m;i++)
	   {
		  if (ch.charAt(i) != ' ')
		  {
			 s = tangible.StringFunctions.changeCharacter(s, j, ch.charAt(i));
			 j++;
			 word = 1;
		  }
		 else if (word == 1)
		 {
			  word = 0;
			  s = tangible.StringFunctions.changeCharacter(s, j, ch.charAt(i));
			  j++;
		 }
	   }
	   System.out.println(s);
	   return 0;
	}
}

