package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int q;
		int k;
		int[] len1 = new int[100];
		int[] len2 = new int[100];
		int[][] a = new int[100][26];
		int[][] b = new int[100][26];
		char[][] s = new char[100][101];
		char[][] d = new char[100][101];
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
			s[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d[i] = tempVar3.charAt(0);
		}
		}
		for (i = 0;i < n;i++)
		{
		len1[i] = String.valueOf(s[i]).length();
		len2[i] = String.valueOf(d[i]).length();
	for (j = 0;j < 25;j++)
	{
	if (len1[i] < 4)
	{
		break;
	}
			len1[i] -= 4;
			for (q = 0;q < 4;q++)
			{
			a[i][j] = a[i][j] * 10 + (s[i] + len1[i])[q] - '0';
			}

	}
			for (q = 0;q < len1[i];q++)
			{
			a[i][j] = a[i][j] * 10 + s[i][q] - '0';
			}
	for (j = 0;j < 25;j++)
	{
	if (len2[i] < 4)
	{
		break;
	}
			len2[i] -= 4;
			for (q = 0;q < 4;q++)
			{
			b[i][j] = b[i][j] * 10 + (d[i] + len2[i])[q] - '0';
			}
	}
			for (q = 0;q < len2[i];q++)
			{
			b[i][j] = b[i][j] * 10 + d[i][q] - '0';
			}
		}
		for (i = 0;i < n;i++)
		{
		for (j = 0;j < 25;j++)
		{
			if (a[i][j] >= b[i][j])
			{
				b[i][j] = a[i][j] - b[i][j];
			}
			else
			{
				b[i][j] = a[i][j] + 10000 - b[i][j];
				a[i][j + 1] -= 1;
			}
		}
		}

		for (i = 0;i < n;i++)
		{
				for (j = 25;j >= 0;j--)
				{
					if (b[i][j] != 0)
					{
					k = j;
					break;
					}
				}
					System.out.printf("%d",b[i][k]);
			for (j = k - 1;j >= 0;j--)
			{
			System.out.printf("%04d",b[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

