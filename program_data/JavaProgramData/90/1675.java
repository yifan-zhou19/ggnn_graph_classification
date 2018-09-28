package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		 int k;
		 if (m < n)
		 {
		 n = m;
		 }

		if (m == 0)
		{
			return 1;
		}
		if (n == 1)
		{
			return 1;
		}
		 return f(m, n - 1) + f(m - n, n);


	}
		 public static int Main()
		 {
			   int i;
			   int t;
			   int m;
			   int n;
			   String tempVar = ConsoleInput.scanfRead();
			   if (tempVar != null)
			   {
				   t = Integer.parseInt(tempVar);
			   }
			   for (i = 1;i <= t;i++)
			   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   m = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   n = Integer.parseInt(tempVar3);
			   }
			   System.out.printf("%d\n",f(m, n));
			   }

			   return 0;
		 }

}

