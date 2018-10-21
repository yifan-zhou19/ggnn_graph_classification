package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int flag;
		int l1;
		int l2;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);

		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		l1 = s1.length();
		l2 = s2.length();

		for (i = 0;i < l1;i++)
		{
		   if ((s1.charAt(i) >= 'A') && (s1.charAt(i) <= 'Z'))
		   {
			 s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) + 32);
		   }
		}

		for (i = 0;i < l2;i++)
		{
		   if ((s2.charAt(i) >= 'A') && (s2.charAt(i) <= 'Z'))
		   {
			 s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) + 32);
		   }
		}

		flag = strcmp(s1,s2);
		if (flag > 0)
		{
		  System.out.print(">");
		}
		else if (flag < 0)
		{
		  System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}
		return 0;
	}

}

