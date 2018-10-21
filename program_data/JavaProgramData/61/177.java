package <missing>;

public class GlobalMembers
{
	public static int fibbnacci(int x)
	{
	int a;
	int b;
	int c;
	a = b = 1;
	if (x == 1 || x == 2)
	{
		return a;
	}
	for (int i = 3;i <= x;i++)
	{
		c = b;
		b = a + b;
		a = c;
	}
	return b;
	}
	public static int Main()
	{
	int[] a = new int[15];
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

	for (int j = 0;j < n;j++)
	{
	System.out.print(fibbnacci(a[j]));
	System.out.print("\n");
	}
	return 0;
	}


}

