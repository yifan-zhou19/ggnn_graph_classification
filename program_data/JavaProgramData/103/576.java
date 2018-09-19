package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int j = 1;
	int i = 0;
	String s = new String(new char[1001]);
	String s2 = new String(new char[1001]);
	s = new Scanner(System.in).nextLine();
	for (;i <= 1000;i++)
	{
	   if ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
	   {
	   s2 = tangible.StringFunctions.changeCharacter(s2, i, (s.charAt(i) - 'a'+'A'));
	   }
	   else
	   {
		   s2 = tangible.StringFunctions.changeCharacter(s2, i, s.charAt(i));
	   }
	}

	for (i = 0;i <= 1000 && (s2.charAt(i) != '\0');i++)
	{
		if (s2.charAt(i) == s2.charAt(i + 1))
		{
		j++;
		}
		else
		{
		 System.out.printf("(%c,%d)",s2.charAt(i),j);
		 j = 1;
		}
	}
	}
}

