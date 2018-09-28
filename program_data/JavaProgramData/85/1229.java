package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] s = new char[100][20];
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
			if (s[i][0] == '_' || (s[i][0] >= 'a' && s[i][0] <= 'z') || (s[i][0] >= 'A' && s[i][0] <= 'Z'))
			{
				int j = 1;
				for (;;j++)
				{
					if (s[i][j] == '_' || (s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] >= '0' && s[i][j] <= '9'))
					{
						;
					}
					else if (s[i][j] == '\0')
					{
						System.out.print("yes\n");
						break;
					}
					else
					{
						System.out.print("no\n");
						break;
					}

				}
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}
}

