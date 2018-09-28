package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] c = new char[100][100];
		int i;
		int n;
		int j;
		int k;
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
			c[i] = tempVar2.charAt(0);
		}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;;j++)
			{
				if (c[i][j] == '\0')
				{
					k = j - 1;
					if (c[i][k] == 'r')
					{
						for (j = 0;j < k - 1;j++)
						{
						System.out.printf("%c",c[i][j]);
						}
					}
					if (c[i][k] == 'y')
					{
						for (j = 0;j < k - 1;j++)
						{
						System.out.printf("%c",c[i][j]);
						}
					}
					if (c[i][k] == 'g')
					{
						for (j = 0;j < k - 2;j++)
						{
						System.out.printf("%c",c[i][j]);
						}
					}
					System.out.print("\n");
					break;
				}

			}
		}

	}
}

