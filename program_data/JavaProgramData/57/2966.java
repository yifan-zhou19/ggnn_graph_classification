package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		char[][] ip = new char[n][40];
		char[][] op = new char[n][40];

		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ip[i] = tempVar2.charAt(0);
			}
		}


		for (i = 0;i < n;i++)
		{
			op[i] = ip[i];
			for (j = 0;j < String.valueOf(ip[i]).length();j++)
			{

				if (ip[i][j] == 'i' && ip[i][j + 1] == 'n' && ip[i][j + 2] == 'g' && ip[i][j + 3] == 0)
				{
					op[i][j] = 0;
				}
				else if (ip[i][j] == 'e' && ip[i][j + 1] == 'r' && ip[i][j + 2] == 0)
				{
					op[i][j] = 0;
				}
				else if (ip[i][j] == 'l' && ip[i][j + 1] == 'y' && ip[i][j + 2] == 0)
				{
					op[i][j] = 0;
				}
			}
			System.out.printf("%s\n",op[i]);
		}

		return 0;
	}

}

