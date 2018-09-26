package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] m = new int[60];
		int[] l = new int[30];
		char[][] a = new char[30][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 2 * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < 2 * n;i++)
		{
			m[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			l[i] = m[2 * i] - m[2 * i + 1];
		}

	for (i = 0;i < n;i++)
	{
			for (j = m[2 * i + 1] - 1;j >= 0;j--)
			{
				if (a[2 * i + 1][j] <= a[2 * i][j + l[i]])
				{
					a[2 * i][j + l[i]] = a[2 * i][j + l[i]] - a[2 * i + 1][j] + '0';
				}
			else
			{
					a[2 * i][j - 1 + l[i]] = a[2 * i][j - 1 + l[i]] - 1;
					a[2 * i][j + l[i]] = a[2 * i][j + l[i]] - a[2 * i + 1][j] + 10 + '0';
			}
			}
	}
	for (i = 0;i < n;i++)
	{
		System.out.printf("%s\n",a[2 * i]);
	}


	}
}

