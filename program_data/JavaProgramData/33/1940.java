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
		char[][] a = new char[1000][256];
		int i;
		int j;
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

				if (a[i][j] == 'A')
				{
					a[i][j] = 't';
				}
				if (a[i][j] == 'T')
				{
					a[i][j] = 'A';
				}
				if (a[i][j] == 'C')
				{
					a[i][j] = 'g';
				}
				if (a[i][j] == 'G')
				{
					a[i][j] = 'C';
				}
				if (a[i][j] == 't')
				{
					a[i][j] = 'T';
				}
				if (a[i][j] == 'g')
				{
					a[i][j] = 'G';
				}
			}
			System.out.printf("%s\n",a[i]);
		}

		return 0;
	}
}

