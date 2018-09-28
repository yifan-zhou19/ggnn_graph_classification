package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[10000][21];
		int n;
		int i;
		int j;
		int[] c = new int[10000];
		int[] d = new int[10000];
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
				(s[i]) = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i][0] == '_' || (s[i][0] >= 'a' && s[i][0] <= 'z') || (s[i][0] >= 'A' && s[i][0] <= 'Z'))
			{
				d[i]++;
			}
			else
			{
				c[i] = 1;
			}
			for (j = 0;s[i][j] != '\0';j++)
			{
				if ((s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] >= '0' && s[i][j] <= '9') || s[i][j] == '_')
				{
					continue;
				}
				else
				{
					c[i] = 1;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
		if (c[i] == 0)
		{
				System.out.print("yes\n");
		}
			else
			{
				System.out.print("no\n");
			}

		}
		return 0;
	}


}

