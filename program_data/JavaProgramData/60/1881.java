package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int t;
		  int m;
		  int p;
		  t = 1;
		  int[] a = new int[10000];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  if (n < 5)
		  {
		  System.out.print("empty");
		  }
		  else
		  {
			  System.out.print("3 5");
			  for (i = 2;i <= n;i++)
			  {
			  a[t] = i;
						   for (j = i;j > 1;j--)
						   {
			  if (i % j == 0)
			  {
		  m = j;
			  }
						   }
		  if (m == i)
		  {
			  a[t] = i;
		  t = t + 1;
		  }
			  }
		  for (p = 3;p < t;p++)
		  {
			  if (a[p + 1] - a[p] == 2)
			  {
		  System.out.printf("\n%d %d",a[p],a[p + 1]);
			  }
		  }
		  }
	}
}

