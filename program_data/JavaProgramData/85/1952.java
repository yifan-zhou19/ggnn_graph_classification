package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] b = new int[100];
		char[][] s = new char[100][21];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = tempVar2.charAt(0);
			}
			for (j = 0;s[i][j] != 0;j++)
			{
				if ((s[i][0] == '_') || (s[i][0] >= 'A' && s[i][0] <= 'Z') || (s[i][0] >= 'a' && s[i][0] <= 'z'))
				{
					if ((s[i][j] == '_') || (s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] >= '0' && s[i][j] <= '9' && j>0))
					{
						continue;
					}
					else
					{
						b[i]++;
						break;
					}
				}
				else
				{
					b[i]++;
					break;
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (b[i] > 0)
			{
				System.out.print("no\n");
			}
			else
			{
				System.out.print("yes\n");
			}
		}
		return 0;
	}


}

