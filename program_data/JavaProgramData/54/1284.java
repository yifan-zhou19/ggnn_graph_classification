package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static int wa(int p,int q)
	{
	   if (p == 0)
	   {
		 return q;
	   }
	   if (q % (n - 1) == 0)
	   {
		 return wa(p - 1, q / (n - 1) * n + k);
	   }
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		i = n - 1;
		while (sum == 0)
		{
			sum = wa(n, i);
			i++;
		}
		System.out.printf("%d",sum);

	 return 0;
	}

}

