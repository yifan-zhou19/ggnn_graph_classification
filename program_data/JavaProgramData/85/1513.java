package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		char[][] s = new char[1000][21];
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
			if ((s[i][0] >= '0') && (s[i][0] <= '9'))
			{
					System.out.print("no\n");
			}
			else
			{
				for (j = 0;s[i][j] != '\0';j++)
				{
					m = 0;
					if ((s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] >= 'a' && s[i][j] <= 'z') || s[i][j] == '_' || ((s[i][j] >= '0') && (s[i][j] <= '9')))
					{
						continue;
					}
					else
					{
						System.out.print("no\n");
						m = 1;
						break;
					}


				}
				if (m == 1)
				{
					continue;
				}
				System.out.print("yes\n");

			}
		}
		return 0;
	}

}

