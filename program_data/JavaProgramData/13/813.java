package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int k;
	  int t;
	  int x;
	  int[] a = new int[20000];
	  int n;
	  int m;
	  int l;
	  l = 0;
	  m = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (k = 1;k <= n;k++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}

		for (i = 1;i <= m + 1;i++)
		{
			if (x == a[i - 1])
			{
				l = 1;
			}
		}
		if (l == 0)
		{
		   a[m] = x;
		   m = m + 1;
		}
		l = 0;
	  }
	   System.out.printf("%d",a[0]);
	   for (t = 1;t <= m - 1;t++)
	   {
		System.out.printf(" %d",a[t]);
	   }
	   System.out.print("\n");
	   return 0;
	}
}

