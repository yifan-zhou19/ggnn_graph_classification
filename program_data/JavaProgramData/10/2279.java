package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		return a > b != 0?a:b;
	}
	public static int n;
	public static int[] a = new int[30];
	public static int after(int i, int fin, int n)
	{
		if (i == n)
		{
		   if (a[n] <= a[fin])
		   {
			return 1;
		   }
		   else
		   {
			   return 0;
		   }

		}
		else
		{
			int z;
			if (a[i] <= a[fin])
			{
				z = max(1 + after(i + 1, i, n), after(i + 1, fin, n));
			}
			else
			{
				z = after(i + 1, fin, n);
			}
			return z;
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		a[0] = 1000000;
		System.out.print(after(1, 0, n));
		System.out.print("\n");
		return 0;
	}

}

