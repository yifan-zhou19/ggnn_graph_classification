package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a = 1;
		char[][] z = new char[100][21];
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
				z[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (z[i][0] == '_' || (z[i][0] >= 'A' && z[i][0] <= 'Z') || (z[i][0] >= 'a' && z[i][0] <= 'z'))
			{
				for (j = 1;z[i][j] != '\0';j++)
				{
					if (z[i][j] == '_' || (z[i][j] >= 'A' && z[i][j] <= 'Z') || (z[i][j] >= 'a' && z[i][j] <= 'z') || (z[i][j] >= '0' && z[i][j] <= '9'))
					{
						a = a * 1;
					}
					else
					{
						a = a * 0;
					}
				}
			}
			else
			{
				a = a * 0;
			}
			if (a == 1)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
				a = 1;
			}
		}
		return 0;
	}

}

