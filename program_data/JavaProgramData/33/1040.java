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
		int[] b = new int[1000];
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
			b[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < String.valueOf(a[i]).length();j++)
			{
				if (a[i][j] == 'A')
				{
					a[i][j] = 'T';
				}
				else if (a[i][j] == 'T')
				{
					a[i][j] = 'A';
				}
				else if (a[i][j] == 'G')
				{
					a[i][j] = 'C';
				}
				else if (a[i][j] == 'C')
				{
					a[i][j] = 'G';
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

