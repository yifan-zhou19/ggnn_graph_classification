package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	int p;
	int q;
	int i;
	int j;
	p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[][] a = new int[p][q];
	int sum = 0;
	for (i = 0;i < p;i++)
	{
	for (j = 0;j < q;j++)
	{
	a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	for (i = 0;i < q;i++)
	{
	sum = sum + a[0][i] + a[p - 1][i];
	}
	for (j = 0;j < p;j++)
	{
	sum = sum + a[j][0] + a[j][q - 1];
	}
	sum = sum - a[0][0] - a[0][q - 1] - a[p - 1][0] - a[p - 1][q - 1];
	System.out.print(sum);
	System.out.print("\n");
	}
	return 0;
	}
}

