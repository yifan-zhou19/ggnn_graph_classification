package <missing>;

public class GlobalMembers
{
	public static int f(int n, int k)
	{
		int j;
		int x;
		int i;
		int t;
	   for (i = 2;1;i++)
	   {
		   t = i;
		   for (j = 1;j <= n;j++)
		   {
		   if ((t - k) % n != 0)
		   {
		 break;
		   }
		  t = (t - k) * (n - 1) / n;
		   }
	   if (j == n + 1)
	   {
		   x = i;
	   break;
	   }
	   }
		return x;
	}
	public static int Main()
	{
		 int n;
		 int k;
		 int i;
		 int y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		 y = f(n, k);
		System.out.print(y);
		System.out.print("\n");
		 return 0;
	}

}

