package <missing>;

public class GlobalMembers
{
	public static int conduct(int n,int k,int c)
	{
		int f;
		int i;
		int t = 1;
		int s;
		if (c != 0)
		{
			f = conduct(n, k, c - 1) / (n - 1) * n + k;
		}
		else
		{
		   for (t = 1;;t++)
		   {
			   s = t * (n - 1);
			   for (i = 0;i < n;i++)
			   {
				   if (s % (n - 1) == 0)
				   {
					   s = s / (n - 1) * n + k;
				   }
				   else
				   {
					   break;
				   }
			   }
			   if (i == n)
			   {
				   break;
			   }
		   }
		   f = t * (n - 1);
		}
		return (f);
	}
	public static void Main()
	{
		int n;
		int k;
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
		System.out.printf("%d",conduct(n, k, n));
	}
}

