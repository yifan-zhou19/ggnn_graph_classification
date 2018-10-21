package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] s = new char[100][20];
		int n;
		int i;
		int j;
		int m;
		int k;
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
			k = 0;
			m = String.valueOf(s[i]).length();
			for (j = 0;j < m;j++)
			{
				if (s[i][0] >= '0' && s[i][0] <= '9')
				{
					k = 1;
					break;
				}
				else if (s[i][j] < '0' || s[i][j]>'9')
				{
					if (s[i][j] > 'z' || s[i][j] < 'a')
					{
						if (s[i][j] < 'A' || s[i][j]>'Z')
						{
							if (s[i][j] != '_')
							{
								k = 1;
								break;
							}
						}
					}
				}
			}
			if (i > 0)
			{
				System.out.print("\n");
			}
			if (k == 1)
			{
				System.out.print("no");
			}
			else if (k == 0)
			{
				System.out.print("yes");
			}
		}
	}
}

