package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[][] a = new char[1000][257];
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
				switch (a[i][j])
				{
				case'A':
					a[i][j] = 'T';
					break;
				case'G':
					a[i][j] = 'C';
					break;
				case'C':
					a[i][j] = 'G';
					break;
				case'T':
					a[i][j] = 'A';
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s",a[i]);
			if (i != n - 1)
			{
				System.out.print("\n");
			}
		}

		return 0;
	}

}

