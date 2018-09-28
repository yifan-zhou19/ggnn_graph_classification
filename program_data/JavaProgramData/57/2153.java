package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		char[][] str = new char[50][10];
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
				str[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 10;j++)
			{
				if (str[i][j] == 'e' && str[i][j + 1] == 'r' && str[i][j + 2] == '\0')
				{
					for (k = 0;k < j - 1;k++)
					{
						System.out.printf("%c",str[i][k]);
					}
					System.out.printf("%c\n",str[i][j - 1]);
				}
				if (str[i][j] == 'l' && str[i][j + 1] == 'y' && str[i][j + 2] == '\0')
				{
					for (k = 0;k < j - 1;k++)
					{
						System.out.printf("%c",str[i][k]);
					}
					System.out.printf("%c\n",str[i][j - 1]);
				}
				if (str[i][j] == 'i' && str[i][j + 1] == 'n' && str[i][j + 2] == 'g' && str[i][j + 3] == '\0')
				{
						for (k = 0;k < j - 1;k++)
						{
						System.out.printf("%c",str[i][k]);
						}
					System.out.printf("%c\n",str[i][j - 1]);
				}
			}
		}
	}
}

