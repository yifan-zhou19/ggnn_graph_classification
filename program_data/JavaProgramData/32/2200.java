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
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		int i;
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
		int p;
		int q;
		for (i = 0;i < n;i++)
		{
			for (p = 0;a[i][p] != '\0';p++)
			{
				;
			}
			for (q = 0;b[i][q] != '\0';q++)
			{
				;
			}
			int j;
			int x = 0;
			for (j = 1;j <= q;j++)
			{
				if ((a[i][p - j] + x) < b[i][q - j])
				{
					a[i][p - j] = a[i][p - j] + 10 - (b[i][q - j] - '0') + x;
					x = -1;
				}
				else
				{
					a[i][p - j] = a[i][p - j] - (b[i][q - j] - '0') + x;
					x = 0;
				}
			}
			a[i][p - j] += x;
			System.out.printf("\n%s",a[i]);
		}
		return 0;
	}

}

