package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] x = new int[20];
	int ai;
	int i;
	int j;
	int b;
	x[1] = 1;
	x[2] = 1;
	for (j = 3;j <= 20;j++)
	{
		x[j] = x[j - 1] + x[j - 2];
	}
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= n;i++)
	{
		ai = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = x[ai];
		System.out.print(b);
		System.out.print("\n");
	}
	return 0;
	}

}

