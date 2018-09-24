package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] str = new char[50][50];
		int i;
		int k;
		for (i = 0;i <= n;i++)
		{
			str[i] = new Scanner(System.in).nextLine();
			k = String.valueOf(str[i]).length();
			if ((str[i][k - 1] == 'r' && str[i][k - 2] == 'e') || (str[i][k - 1] == 'y' && str[i][k - 2] == 'l'))
			{
				str[i][k - 1] = '\0';
				str[i][k - 2] = '\0';
			}
			else if ((str[i][k - 1] == 'g' && str[i][k - 2] == 'n' && str[i][k - 3] == 'i'))
			{
				str[i][k - 1] = '\0';
				str[i][k - 2] = '\0';
				str[i][k - 3] = '\0';
			}


		}
		int j;
		char kk;
		for (i = 0;i <= n;i++)
		{
			for (j = 0;(kk = str[i][j]) != '\0';j++)
			{
				System.out.printf("%c",str[i][j]);
			}
			System.out.print("\n");
		}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		i = Integer.parseInt(tempVar2);
	}
		return 0;
	}
}

