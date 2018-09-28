package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int result = new int(int m,int n);
		int m;
		int n;
		int k;
		int i;
		int[] a = new int[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   k = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < k;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   m = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   n = Integer.parseInt(tempVar3);
		   }
	   a[i] = result(m, n);
	   }
	   for (i = 0;i < k;i++)
	   {
		   System.out.printf("%d\n",a[i]);
	   }
	}
	public static int result(int m,int n)
	{
		int x;
		if (n == 1)
		{
		x = 1;
		}
		else
		{
			if (m > n)
			{
		x = result(m, n - 1) + result(m - n, n);
			}
		 else if (m == n)
		 {
		 x = result(m, n - 1) + 1;
		 }
		 else
		 {
			 x = result(m, n - 1);
		 }
		}
		return (x);
	}
}

