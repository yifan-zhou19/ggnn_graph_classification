package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][256];
		int n;
		int i;
		int j;
		int[] b = new int[1000];
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
			b[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < b[i];j++)
			{
				switch (a[i][j])
				{
					case 'A':
						a[i][j] = 'T';
						break;
					case 'G':
						a[i][j] = 'C';
						break;
					case 'C':
						a[i][j] = 'G';
						break;
					case 'T':
						a[i][j] = 'A';
						break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%s\n",a[i]);
		}
		return 0;
	}


}

