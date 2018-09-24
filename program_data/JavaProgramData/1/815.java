package <missing>;

public class GlobalMembers
{
	public static int i = 0;
	public static int f(int n,int m)
	{
		int k = 0;
	if (m == 1)
	{
	i++;
	}
	else
	{
		for (k = n;k <= m;k++)
		{
		   if (m % k == 0)
		   {
			n = k;
		 f(n, m / n);
		   }
		}
	}
	return (i);
	}
	public static int Main()
	{
	 int n;
	 int b;
	 int c;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int a;
	 for (b = 0;b < n;b++)
	 {
		   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = f(2, a);
		System.out.print(c);
		System.out.print("\n");
		i = 0;
	 }
	 return 0;
	}



}

