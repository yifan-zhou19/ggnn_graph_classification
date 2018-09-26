package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][1000];
		final String b = "";
		int n;
		int i;
		int j;
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
			for (j = 0;a[i][j] == 'A' || a[i][j] == 'C' || a[i][j] == 'T' || a[i][j] == 'G';j++)
			{
				if (a[i][j] == 'A')
				{
					b.charAt(i)[j] = 'T';
				}
				else if (a[i][j] == 'T')
				{
					b.charAt(i)[j] = 'A';
				}
				else if (a[i][j] == 'C')
				{
					b.charAt(i)[j] = 'G';
				}
				else if (a[i][j] == 'G')
				{
					b.charAt(i)[j] = 'C';
				}
			}
			b.charAt(i)[j] = '\0';
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",b.charAt(i));
		}
		return 0;
	}



}

