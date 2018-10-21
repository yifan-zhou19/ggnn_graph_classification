package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		int n = a.length();
		int i;
		int flag = 0;
		int t = 0;
		for (i = 0;i < n;i++)
		{
			if ((a.charAt(i) == ' ') && t == 0)

			{
				   b = tangible.StringFunctions.changeCharacter(b, flag++, a.charAt(i));
				   t = 1;
			}
			   else if (a.charAt(i) != ' ')
			   {
				   b = tangible.StringFunctions.changeCharacter(b, flag++, a.charAt(i));
				   t = 0;
			   }
			   else if (a.charAt(i) == ' ' && t != 0)
			   {
			   continue;
			   }

		}
		for (i = 0;i < flag;i++)
		{
		System.out.printf("%c",b.charAt(i));
		}
	}

}

