package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		char[][] str = new char[50][20];
		char[][] str2 = new char[50][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;)
		{
			str[i] = new Scanner(System.in).nextLine();
			m = String.valueOf(str[i]).length();
			if (str[i][m - 2] == 'e' && str[i][m - 1] == 'r' || str[i][m - 2] == 'l' && str[i][m - 1] == 'y')
			{
				for (j = 0;j < m - 2;j++)
				{
					str2[i][j] = str[i][j];
				}
				str2[i][j] = '\0';
				//printf("%d,%s",i,str2[i]);
				i++;
			}
			else if (str[i][m - 3] == 'i' && str[i][m - 2] == 'n' && str[i][m - 1] == 'g')
			{
				for (j = 0;j <= m - 3;j++)
				{
					if (j < m - 3)
					{
						str2[i][j] = str[i][j];
					}
					else if (j == m - 3)
					{
						str2[i][j] = '\0';
					}
				}
				str2[i][j] = '\0';
				//printf("%d,%s",i,str2[i]);
				i++;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",str2[i]);
		}
		return 0;
	}
}

