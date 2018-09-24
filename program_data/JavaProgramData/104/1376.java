package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int n;
	public static int k;

	public static void work(int p,int u)
	{
		if (u == 1)
		{
			System.out.print(p);
			System.exit(0);
		}
		if (p % (n - 1) == 0)
		{
	  if ((n * p / (n - 1) + k) % n == k)
	  {
		 work(n * p / (n - 1) + k, u - 1);
	  }
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != k)
		{
						if (n > k)
						{
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
							n = n >> 1;
						}
						else
						{
//C++ TO JAVA CONVERTER WARNING: The right shift operator was not replaced by Java's logical right shift operator since the left operand was not confirmed to be of an unsigned type, but you should review whether the logical right shift operator (>>>) is more appropriate:
							k = k >> 1;
						}
		}
	  System.out.print(n);
		return 0;
	}

}

