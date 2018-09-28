package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] c = new char[20][50];
		int i;
		int j;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (!((c[i][0] >= 'a' && c[i][0] <= 'z') || (c[i][0] >= 'A' && c[i][0] <= 'Z') || c[i][0] == '_'))
			{
				t = 0;
			}
			else
			{
				for (j = 1;c[i][j] != '\0';j++)
				{
					if (!((c[i][j] >= 'a' && c[i][j] <= 'z') || (c[i][j] >= 'A' && c[i][j] <= 'Z') || (c[i][j] >= '0' && c[i][j] <= '9') || c[i][j] == '_'))
					{
						t = 0;
						break;
					}
					t = 1;
				}
			}
			if (t == 1)
			{
				System.out.print("yes\n");
			}
			if (t == 0)
			{
				System.out.print("no\n");
			}
		}
	}
}

