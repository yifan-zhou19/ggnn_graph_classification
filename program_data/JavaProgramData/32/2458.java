package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] a = new char[100][102];
		char[][] b = new char[100][102];
		char[][] c = new char[100][102];
		int n;
		int i;
		int j;
		int m;
		int k;
		int l;
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
			k = String.valueOf(a[i]).length();
			m = String.valueOf(b[i]).length();
			for (j = k - 1;j >= k - m;j--)
			{
				if (a[i][j] < b[i][j + m - k])
				{
					c[i][j] = a[i][j] + 58 - b[i][j + m - k];
					a[i][j - 1]--;
				}
				else
				{
					c[i][j] = a[i][j] + 48 - b[i][j + m - k];
				}
			}
			for (j = 0;j < k - m;j++)
			{
				if (a[i][j] >= '0')
				{
					c[i][j] = a[i][j];
				}
				else
				{
					c[i][j] = a[i][j] + 10;
				}
			}
			c[i][k] = '\0';
			for (j = 0;j < k;j++)
			{
				if (c[i][j] != '0')
				{
					break;
				}
			}
			if (a[i][0] == '0')
			{
				for (j = 0;j < k;j++)
				{
					c[i][j] = c[i][j + 1];
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.println(c[i]);
		}
	}
}

