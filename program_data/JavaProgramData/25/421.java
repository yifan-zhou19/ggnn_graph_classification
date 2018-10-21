package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] b = new int[2][100];
	b[0][0] = 2;
	int n;
	int i;
	int j;
	int k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n == 0)
	{
	System.out.print("1");
	System.out.print("\n");
	}
	else if (n == 1)
	{
	System.out.print("2");
	System.out.print("\n");
	}
	else
	{
	for (i = 1;i < n;i++)
	{
		k = 90;
	while (b[0][k] == 0)
	{
		k--;
	}

	for (j = 0;j <= k + 1;j++)
	{
		if (j != 0)
		{
		b[1][j] = b[0][j] * 2 + b[1][j - 1] / 10;
	b[0][j] = b[1][j] % 10;
		}
	else
	{
		b[1][0] = b[0][0] * 2;
	b[0][0] = b[1][0] % 10;
	}
	}
	}

	k = 90;
	while (b[0][k] == 0)
	{
		k--;
	}

	for (;k >= 0;k--)
	{
	System.out.print(b[0][k]);
	}
	}
	return 0;
	}
}

