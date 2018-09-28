package <missing>;

public class GlobalMembers
{
	public static int allfilled(int m, int n)
	{
		 int z;
		 if (m == n)
		 {
			return 1;
		 }
		 else if (n == 1)
		 {
			return 1;
		 }
		 else
		 {
		 if (m - n >= n)
		 {
			z = allfilled(m - n, n) + notallfilled(m - n, n);
		 }
		 else
		 {
			z = notallfilled(m - n, n);
		 }
		 return z;
		 }
	}
	public static int notallfilled(int m, int n)
	{
		 int z;
		 if (n == 1)
		 {
			return 0;
		 }
		 else
		 {
		 if (m < n - 1)
		 {
			z = notallfilled(m, n - 1);
		 }
		 else
		 {
			z = allfilled(m, n - 1) + notallfilled(m, n - 1);
		 }
		 return z;
		 }
	}
	public static int Main()
	{
		  int t;
		  int i;
		  int m;
		  int n;
		  int c;
		  int d;
		  int sum;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  t = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < t;i++)
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
		  if (m >= n)
		  {
			  c = notallfilled(m, n);
			  d = allfilled(m, n);
			  sum = c + d;
		  }
		  else
		  {
			  sum = notallfilled(m, n);
		  }
		  System.out.printf("%d\n",sum);
		  }

	}

}

