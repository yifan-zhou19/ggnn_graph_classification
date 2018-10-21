package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[100][100];
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int hd;
		int hu;
		int lr;
		int ll;

		if (m % 2 == 0 && m <= n) //???????? ??????????
		{
		for (i = 0,j = 0;i <= (m / 2 - 1);i++,j++) //????????? ???????? ????????
		{
		for (lr = j;lr < (n - j);lr++)
		{
			System.out.printf("%d\n",a[i][lr]);
		}
		for (hd = i + 1;hd < (m - i);hd++)
		{
			System.out.printf("%d\n",a[hd][n - 1 - j]);
		}
		for (ll = n - 2 - j;ll >= j;ll--)
		{
			System.out.printf("%d\n",a[m - 1 - i][ll]);
		}
		for (hu = m - 2 - i;hu > i;hu--)
		{
			System.out.printf("%d\n",a[hu][j]);
		}
		}
		}


		if (n % 2 == 0 && m > n)
		{
		for (i = 0,j = 0;j <= (n / 2 - 1);i++,j++)
		{
		for (lr = j;lr < (n - j);lr++)
		{
			System.out.printf("%d\n",a[i][lr]);
		}
		for (hd = i + 1;hd < (m - i);hd++)
		{
			System.out.printf("%d\n",a[hd][n - 1 - j]);
		}
		for (ll = n - 2 - j;ll >= j;ll--)
		{
			System.out.printf("%d\n",a[m - 1 - i][ll]);
		}
		for (hu = m - 2 - i;hu > i;hu--)
		{
			System.out.printf("%d\n",a[hu][j]);
		}
		}
		}

		if (m > n && n % 2 != 0)
		{
		for (i = 0,j = 0;j <= ((n - 1) / 2 - 1);i++,j++)
		{
		for (lr = j;lr < (n - j);lr++)
		{
			System.out.printf("%d\n",a[i][lr]);
		}
		for (hd = i + 1;hd < (m - i);hd++)
		{
			System.out.printf("%d\n",a[hd][n - 1 - j]);
		}
		for (ll = n - 2 - j;ll >= j;ll--)
		{
			System.out.printf("%d\n",a[m - 1 - i][ll]);
		}
		for (hu = m - 2 - i;hu > i;hu--)
		{
			System.out.printf("%d\n",a[hu][j]);
		}
		}
		for (j = (n - 1) / 2;j < m - (n - 1) / 2;j++)
		{
			System.out.printf("%d\n",a[j][(n - 1) / 2]);
		}
		}

		if (m <= n != 0 && m % 2 != 0)
		{
		for (i = 0,j = 0;i <= ((m - 1) / 2 - 1);i++,j++)
		{
		for (lr = j;lr < (n - j);lr++)
		{
			System.out.printf("%d\n",a[i][lr]);
		}
		for (hd = i + 1;hd < (m - i);hd++)
		{
			System.out.printf("%d\n",a[hd][n - 1 - j]);
		}
		for (ll = n - 2 - j;ll >= j;ll--)
		{
			System.out.printf("%d\n",a[m - 1 - i][ll]);
		}
		for (hu = m - 2 - i;hu > i;hu--)
		{
			System.out.printf("%d\n",a[hu][j]);
		}
		}
		for (i = (m - 1) / 2;i < n - (m - 1) / 2;i++)
		{
			System.out.printf("%d\n",a[(m - 1) / 2][i]);
		}
		}

	}

}

