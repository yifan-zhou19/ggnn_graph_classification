package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[20][100];
		char[][] b = new char[20][100];
		int k;
		int l;
		int j;
		int t;
		int p;
		int i;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			t = (int)String.valueOf(a[i]).length();
			p = (int)String.valueOf(b[i]).length();
			for (k = t - 1,l = p - 1;l >= 0;k--,l--)
			{
				if (a[i][k] >= b[i][l])
				{
					a[i][k] = a[i][k] - b[i][l];
				}
				else
				{
					a[i][k] = a[i][k] + 10 - b[i][l];
					a[i][k - 1] = a[i][k - 1] - 1;
				}
			}
			for (j = 0;j < (t - p);j++)
			{
				System.out.printf("%c",a[i][j]);
			}
			for (j = t - p;j < t;j++)
			{
				System.out.printf("%c",a[i][j] + '0');
			}
			System.out.print("\n");
		}
	}
}

