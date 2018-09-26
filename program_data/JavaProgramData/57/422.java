package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[50][50];
		int i;
		int j;
		int n;
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
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;a[i][j] != '\0';j++)
			{
				if (a[i][j] == 'e' && a[i][j + 1] == 'r' && a[i][j + 2] == '\0')
				{
					a[i][j] = '\0';
					break;
				}
				else if (a[i][j] == 'l' && a[i][j + 1] == 'y' && a[i][j + 2] == '\0')
				{
					a[i][j] = '\0';
					break;
				}
				else if (a[i][j] == 'i' && a[i][j + 1] == 'n' && a[i][j + 2] == 'g' && a[i][j + 3] == '\0')
				{
					a[i][j] = '\0';
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(a[i]);
		}
		return 0;
	}



}

