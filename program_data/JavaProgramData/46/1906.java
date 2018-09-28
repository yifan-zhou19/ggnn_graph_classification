package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] tt = new int[100][100];
	int r;
	int c;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		r = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		c = Integer.parseInt(tempVar2);
	}
	for (int x = 0;x < r;x++)
	{
		for (int y = 0;y < c;y++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				tt[x][y] = Integer.parseInt(tempVar3);
			}
		}
	}
	int i1 = 0;
	int i2 = c - 1;
	int i3 = r - 1;
	int i4 = 0;
	int m1 = 0;
	int m2 = 1;
	int m3 = c - 2;
	int m4 = r - 2;
	int n1 = c - 1;
	int n2 = r - 1;
	int n3 = 0;
	int n4 = 1;
	int j;
	int s = 0;
	int a = 1;
	while (true)
	{
	for (j = m1;j <= n1 != 0 && a == 1;j++)
	{
		System.out.printf("%d\n",tt[i1][j]);
		s += 1;
		if (s == r * c)
		{
			a = 0;
		}
	}
	m1++;
	n1--;
	i1++;
	for (j = m2;j <= n2 != 0 && a == 1;j++)
	{
		System.out.printf("%d\n",tt[j][i2]);
		s += 1;
		if (s == r * c)
		{
			a = 0;
		}
	}
	m2++;
	n2--;
	i2--;
	for (j = m3;j >= n3 != 0 && a == 1;j--)
	{
		System.out.printf("%d\n",tt[i3][j]);
		s += 1;
		if (s == r * c)
		{
			a = 0;
		}
	}
	m3--;
	n3++;
	i3--;
	for (j = m4;j >= n4 != 0 && a == 1;j--)
	{
		System.out.printf("%d\n",tt[j][i4]);
		s += 1;
		if (s == r * c)
		{
			a = 0;
		}
	}
	m4--;
	n4++;
	i4++;
	if (a == 0)
	{
		break;
	}
	}
	return 0;
	}
}

