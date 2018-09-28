package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int la;
		int lb;
		int t;
		char[][] a = new char[1000][100];
		char[][] b = new char[1000][100];
		char[][] c = new char[1000][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 1;i <= n;i++)
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
			System.out.print("\n");
		}

		for (i = 1;i <= n;i++)
		{
			la = String.valueOf(a[i]).length();
			lb = String.valueOf(b[i]).length();
			for (j = la - 1,k = lb - 1;k >= 0;j--,k--)
			{
				if (a[i][j] >= b[i][k])
				{
					c[i][j] = a[i][j] - b[i][k];
				}
				else
				{
					c[i][j] = a[i][j] - b[i][k] + 10;
				a[i][j - 1]--;
				}
			}
			for (j = la - lb - 1;j >= 0;j--)
			{
				if (a[i][j] >= '0')
				{
					c[i][j] = a[i][j] - '0';
				}
				else
				{
					c[i][j] = a[i][j] + 10 - '0';
				a[i][j - 1]--;
				}
			}
			for (j = 0;;j++)
			{
				if (c[i][j] != 0)
				{
					break;
				}
			}
				t = j;
			for (j = t;j <= la - 1;j++)
			{
			System.out.printf("%d",c[i][j]);
			}
			System.out.print("\n");
		}
	}
}

