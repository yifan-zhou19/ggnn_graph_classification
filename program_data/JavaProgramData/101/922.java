package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	for (int i = 0;i < 3;i++)
	{ //for?????????????//
	for (int j = 0;j < 3;j++)
	{
	for (int k = 0;k < 3;k++)
	{
	a = (j > i) + (i == k) == 2 - i;
	b = (i > j) + (i > k) == 2 - j;
	c = (k > j) + (j > i) == 2 - k;
	if (a != 0 && b != 0 && c != 0) //???????????//
	{
	int[] d = {i, j, k};
	int p;
	char[] f = {'A', 'B', 'C'};
	char q;
	for (int x = 0;x < 2;x++)
	{
	for (int y = 0;y < 2 - x;y++)
	{
	if (d[y] > d[y + 1])
	{
	p = d[y];
	d[y] = d[y + 1];
	d[y + 1] = p;
	q = f[y];
	f[y] = f[y + 1]; //??//
	f[y + 1] = q;
	}
	}
	}
	System.out.print(f[0]);
	System.out.print(f[1]);
	System.out.print(f[2]);
	}
	}
	}
	}

	return 0;
	}

}
