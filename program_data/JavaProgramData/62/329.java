package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int t;
	   int j;
	   int s;
	   String a = new String(new char[210]);
	   String b = new String(new char[210]);
	   a = new Scanner(System.in).nextLine();
	   t = a.length();
	   j = 0;
	   s = 0;
	   for (i = 0;i < t;i++)
	   {
		   if (a.charAt(i) == ' ')
		   {
			   if (j == 0)
			   {
				   b = tangible.StringFunctions.changeCharacter(b, s, a.charAt(i));
				   s++;
				   j++;
			   }
		   }
		   else
		   {
			   b = tangible.StringFunctions.changeCharacter(b, s, a.charAt(i));
			   s++;
			   j = 0;
		   }
	   }
	   b = tangible.StringFunctions.changeCharacter(b, s, '\0');
	   System.out.println(b);
	   return 0;
	}
}

