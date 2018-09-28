package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][256];
		int i;
		int k;
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
			for (k = 0;;k++)
			{
				if (a[i][k] == '\0')
				{
					System.out.printf("%s\n",a[i]);
					break;
				}
				if (a[i][k] == 'A')
				{
					a[i][k] = 'T';
				}
				else if (a[i][k] == 'T')
				{
					a[i][k] = 'A';
				}
				else if (a[i][k] == 'C')
				{
					a[i][k] = 'G';
				}
				else
				{
					a[i][k] = 'C';
				}
			}
		}
		return 0;
	}

}

