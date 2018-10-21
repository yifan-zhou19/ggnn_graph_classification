package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] s = new char[n][81];
		char c;
		c = System.in.read();
		int[] ss = new int[n];
		for (i = 0;i < n;i++)
		{
			ss[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
			int S = String.valueOf(s[i]).length();
			if (s[i][0] == '_' || (s[i][0] <= 'Z' && s[i][0] >= 'A') || (s[i][0] <= 'z' && s[i][0] >= 'a'))
			{
				for (j = 1;j < S;j++)
				{
					if (s[i][j] == '_' || (s[i][j] <= 'Z' && s[i][j] >= 'A') || (s[i][j] <= 'z' && s[i][j] >= 'a') || (s[i][j] <= '9' && s[i][j] >= '0'))
					{
						ss[i] = ss[i] * 1;
					}
					else
					{
						ss[i] = 0;
					}
				}
			}
			else
			{
				ss[i] = 0;
			}
			System.out.printf("%d\n",ss[i]);
		}
	}
}

