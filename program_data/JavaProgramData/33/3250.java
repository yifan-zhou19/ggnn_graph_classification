package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		final String s = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, new Scanner(System.in).nextLine());
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;s.charAt(i)[j] != null;j++)
			{
				if (s.charAt(i)[j] == 'A')
				{
					s.charAt(i)[j] = 'T';
				}
				else if (s.charAt(i)[j] == 'T')
				{
					s.charAt(i)[j] = 'A';
				}
				else if (s.charAt(i)[j] == 'G')
				{
					s.charAt(i)[j] = 'C';
				}
				else if (s.charAt(i)[j] == 'C')
				{
					s.charAt(i)[j] = 'G';
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}

