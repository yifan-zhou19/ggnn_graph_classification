package <missing>;

public class GlobalMembers
{
	public static int empty(int n,int m)
	{
		int k;
		if (m == n)
		{
				if (n == 1)
				{
					k = 1;
				}
				else
				{
					k = 1 + empty(n - 1, m);
				}
		}
		if (m > n)
		{
			   if (n == 1)
			   {
				   k = 1;
			   }
			   else
			   {
				   k = empty(n - 1, m) + empty(n, m - n);
			   }
		}
		if (m < n)
		{
			k = empty(m, m);
		}
		return k;
	}
	public static int Main()
	{
			  int i;
			  int t;
			  int a;
			  int b;
			  int c;
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
								  a = Integer.parseInt(tempVar2);
							  }
							  String tempVar3 = ConsoleInput.scanfRead(" ");
							  if (tempVar3 != null)
							  {
								  b = Integer.parseInt(tempVar3);
							  }
							  c = empty(b, a);
							  System.out.printf("%d\n",c);
			  }
	}

}

