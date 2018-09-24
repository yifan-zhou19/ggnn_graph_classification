package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		String str = new String(new char[50]);
		char[][] s = new char[50][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			str = new Scanner(System.in).nextLine();
			m = str.length() - 2;
			s[i][m] = 0;
			s[i] = str.substring(0, m);

			if (s[i][m - 1] == 105)
			{
				s[i][m - 1] = 0;
				s[i] = str.substring(0, m - 1);

			}

		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",s[i]);
		}
		return 0;

	}
}

