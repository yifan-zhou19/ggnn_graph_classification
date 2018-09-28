package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		char[][] str = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		str[0] = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
		str[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n - 1;i++)
		{
			k = 1;
			for (j = 0;str[i][j] != '\0';j++)
			{
				if (j == 0)
				{
				if ((str[i][j] > 'z' || str[i][j] < 'a') && (str[i][j]>'Z' || str[i][j] < 'A') && str[i][j] != '_')
				{
					System.out.print("0\n");
					k = 0;
					break;
				}
				}
				if (j != 0)
				{
				if ((str[i][j] > 'z' || str[i][j] < 'a') && (str[i][j]>'Z' || str[i][j] < 'A') && (str[i][j] < '0' || str[i][j]>'9') && str[i][j] != '_')
				{
					System.out.print("0\n");
					k = 0;
					break;
				}
				}
			}
			if (k != 0)
			{
				System.out.print("1\n");
			}
		}
		k = 1;
		for (j = 0;str[n - 1][j] != '\0';j++)
		{
			if (j == 0)
			{
			if ((str[i][j] > 'z' || str[i][j] < 'a') && (str[i][j]>'Z' || str[i][j] < 'A') && str[i][j] != '_')
			{
				System.out.print("0");
				k = 0;
				break;
			}
			}
			if (j != 0)
			{
			if ((str[i][j] > 'z' || str[i][j] < 'a') && (str[i][j]>'Z' || str[i][j] < 'A') && (str[i][j] < '0' || str[i][j]>'9') && str[i][j] != '_')
			{
				System.out.print("0");
				k = 0;
				break;
			}
			}
		}
		if (k != 0)
		{
			System.out.print("1");
		}
	}

}

