package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] a = new char[50][32];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i <= n;i++)
		{
			for (j = 0;a[i][j] != '\0';j++)
			{
				if (a[i][j] == 'e' && a[i][j + 1] == 'r' && a[i][j + 2] == '\0')
				{
					a[i][j] = '\0';
					break;
				}
				if (a[i][j] == 'i' && a[i][j + 1] == 'n' && a[i][j + 2] == 'g' && a[i][j + 3] == '\0')
				{
					a[i][j] = '\0';
					break;
				}
				if (a[i][j] == 'l' && a[i][j + 1] == 'y' && a[i][j + 2] == '\0')
				{
					a[i][j] = '\0';
					break;
				}
			}
		}
		for (i = 0;i <= n;i++)
		{
			System.out.println(a[i]);
		}

	}


}

