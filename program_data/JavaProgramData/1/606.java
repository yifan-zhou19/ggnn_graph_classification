package <missing>;

public class GlobalMembers
{
	public static int c;
	public static void cal(int n, int k)
	{
		if (n == 1)
		{
		c++;
	return;
		}
	int i;
	for (i = 2;i <= n;i++)
	{
		if (n % i == 0 && i >= k)
		{
		cal(n / i, i);
		}
	}
	}
	public static int Main(int argc)
	{
		int m;
		int n;
		int j;
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (j = 1;j <= m;j++)
	   {
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = 0;
		cal(n, 1);
	   System.out.print(c);
	   System.out.print("\n");
	   }

		return 0;

	}
}

