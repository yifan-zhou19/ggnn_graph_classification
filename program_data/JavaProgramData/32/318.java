package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[50][100];
		char[][] b = new char[50][100];
		int n;
		int i;
		int j;
		int k;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = String.valueOf(a[i]).length() - 1,k = String.valueOf(b[i]).length() - 1;k >= 0;j--,k--)
			{
				a[i][j] = a[i][j] - b[i][k] + '0';
				if (a[i][j] < '0')
				{
					a[i][j] = a[i][j] + 10;
					a[i][j - 1] = a[i][j - 1] - 1;
				}
			}
		System.out.printf("%s\n",a[i]);
		}
	}

}

