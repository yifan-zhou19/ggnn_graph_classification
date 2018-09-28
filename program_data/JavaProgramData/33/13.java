package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		char[][] s = new char[1000][300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(s[i]).length();j++)
			{
				if (s[i][j] == 'A')
				{
					System.out.print("T");
				}
				if (s[i][j] == 'T')
				{
					System.out.print("A");
				}
				if (s[i][j] == 'C')
				{
					System.out.print("G");
				}
				if (s[i][j] == 'G')
				{
					System.out.print("C");
				}
			}
			System.out.print("\n");
		}

		return 0;
	}

}

