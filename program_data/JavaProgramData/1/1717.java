package <missing>;

public class GlobalMembers
{
	public static int f(int n,int k)
	{
	   if (n < k)
	   {
		   return 0;
	   }
	   int i;
	   int s = 1;
	   for (i = k;i < n;i++)
	   {
		 if (n % i == 0)
		 {
			 s += f(n / i, i);
		 }
	   }
	   return s;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int ans;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (m-- != 0)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   n = Integer.parseInt(tempVar2);
		   }
		   System.out.printf("%d\n",f(n, 2));
		}
		return 0;
	}
}

