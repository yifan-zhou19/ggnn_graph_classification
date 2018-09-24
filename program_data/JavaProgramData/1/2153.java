package <missing>;

public class GlobalMembers
{
	public static void f(int i, int m)
	{
		 int k;
		 int s;
		 s = (int)Math.sqrt(m);
		 for (k = i;k <= s;k++)
		 {
						  if (m % k == 0)
						  {
									sum++;
									f(k, m / k);
						  }

		 }

	}
	public static int sum;
	public static int Main()
	{
		  int n;
		  int i;
		  int m;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < n;i++)
		  {
			  sum = 1;
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  m = Integer.parseInt(tempVar2);
						  }
						  f(2, m);
						  System.out.printf("%d\n",sum);

		  }
	}
}

