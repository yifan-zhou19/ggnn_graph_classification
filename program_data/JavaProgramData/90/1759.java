package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int work(int a,int b)
	{
		 if ((a == 0) || (a == 1) || (b == 1) || (b == 0))
		 {
		 return 1;
		 }
		 if (b > a)
		 {
		 b = a;
		 }
		 return (work(a, b - 1) + work(a - b, b));

	}
	public static int Main()
	{
	   int m;
	   int n;
	   int t;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   t = Integer.parseInt(tempVar);
	   }
	   for (i = 1 ;i <= t;i++)
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
		if (n >= m)
		{
		 n = m;
		}
		sum = work(m, n);
		System.out.printf("%d\n",sum);
		sum = 0;
	   }
	}

}

