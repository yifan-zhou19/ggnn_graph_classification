package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[200][200];
	int[] p = a[0];
	int m;
	int n;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < m;i++)
	{
	for (int j = 0;j < n;j++)
	{
	p[i * n + j] = ConsoleInput.readToWhiteSpace(true);
	}
	}
	for (int i = 0;i < m + n - 1;i++)
	{
	int flag = 1;
	int x = 0;
	int y = i;
	while (flag == 1)
	{
	if (y < n && x >= 0)
	{
		System.out.print((p + x * n + y));
		System.out.print("\n");
	}
	x++;
	y--;
	if (y < 0 || x> m - 1)
	{
		flag = 0;
	}
	}
	}
	}

}

