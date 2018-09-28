package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		char[][] str = new char[1000][1000];
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
			len = String.valueOf(str[i]).length();
			for (j = 0;j < len;j++)
			{
				if (str[i][j] == 'A')
				{
					str[i][j] = 'T';
				}
				else if (str[i][j] == 'T')
				{
					str[i][j] = 'A';
				}
				else if (str[i][j] == 'G')
				{
					str[i][j] = 'C';
				}
				else if (str[i][j] == 'C')
				{
					str[i][j] = 'G';
				}
				else
				{
					str[i][j] = str[i][j];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",str[i]);

		}
		return 0;
	}






}

