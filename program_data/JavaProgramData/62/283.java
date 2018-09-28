package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   String s = new String(new char[205]);
		   String a = new String(new char[205]);
		   int i;
		   int m;
		   s = new Scanner(System.in).nextLine();
		   int len;
		   i = 0;
		   len = s.length();
			 for (int j = 0; j < len; j++)
			 {
			   if (s.charAt(j) != ' ')
			   {
				 a = tangible.StringFunctions.changeCharacter(a, i, s.charAt(j));
			   }
			   else if ((s[j] = ' ') && (s.charAt(j + 1) != ' '))
			   {
				 a = tangible.StringFunctions.changeCharacter(a, i, s.charAt(j));
			   }
			   else
			   {
				   continue;
			   }
				i++;
			 }
			 System.out.printf("%s",a);
		   return 0;
	}
}

