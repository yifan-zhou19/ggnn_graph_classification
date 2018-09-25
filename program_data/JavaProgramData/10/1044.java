package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[26];
	public static int n;
	public static int sum(int k,int b)
	{
	   int x;
	   if (k == 0)
	   {
	   x = 0;
	   }
	   else if (k != 0)
	   {
		 if ((a[n - k] <= b))
		 {
			if ((sum(k - 1, a[n - k]) + 1) >= sum(k - 1, b))
			{
			  b = a[n - k];
			  x = 1 + sum(k - 1, b);
			}
			else
			{
			  x = sum(k - 1, b);
			}

		 }
		  else if ((a[n - k] > b))
		  {
		  x = sum(k - 1, b);
		  }
	   }
	   return x;
	}
	public static int Main()
	{
	int i;
	int j;
	int c = 9999;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i - 1] = Integer.parseInt(tempVar2);
	}
	}
	System.out.printf("%d",sum(n, c));
	}
}

