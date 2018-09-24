package <missing>;

public class GlobalMembers
{
	public static int p(int x)
	{
		 int i;
		 for (i = 2;i <= Math.sqrt(x);i++)
		 {
			 if (x % i == 0)
			 {
				 return (0);
			 }
		 }
		 return (1);
	}
	public static int f(int n,int m)
	{
		 int t;
		 int i;
		 if (n < m)
		 {
			 return (0);
		 }
		 else if (p(n) == 1)
		 {
			 return (1);
		 }
		 else if (m == 1)
		 {
			  t = 1;
			  for (i = m + 1;i < n;i++)
			  {
				   if (n % i == 0)
				   {
					   t = t + f(n / i, i);
				   }
			  }
		 }
		 else if (m != 1)
		 {
			  t = 1;
			  for (i = m;i < n;i++)
			  {
				   if (n % i == 0)
				   {
					   t = t + f(n / i, i);
				   }
			  }
		 }
		 return (t);
	}
	public static int Main()
	{
		 int x;
		 int y;
		 int z;
		 int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 y = Integer.parseInt(tempVar);
		 }
		 for (j = 0;j < y;j++)
		 {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   x = Integer.parseInt(tempVar2);
			   }
			   System.out.printf("%d\n",f(x, 1));
		 }

	}
}

