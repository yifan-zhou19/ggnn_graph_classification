package <missing>;

public class GlobalMembers
{
	public static void pr(int n)
	{
		int z;
		if (n % 2 == 0)
		{
			z = n / 2;
			System.out.printf("%d/2=%d\n",n,z);
		}
		else
		{
			z = 3 * n + 1;
			System.out.printf("%d*3+1=%d\n",n,z);
		}
	}
	public static int jg(int n)
	{
		int z;
		if (n % 2 == 0)
		{
			z = n / 2;
			return (z);
		}
		else
		{
			z = 3 * n + 1;
			return (z);
		}
	}
	public static int Main()
	{
	   int n;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   while (n != 1)
	   {
		   pr(n);
		   n = jg(n);
	   }
	   System.out.print("End\n");
	   return 0;
	}
}

