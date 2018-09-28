package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
	  double x;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }

	  for (int i = 1;i <= m;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[] sz = new int[n + 1];
		for (int j = 0;j < n + 1;j++)
		{
		  sz[j] = sz[j - 1] + sz[j - 2];
		  sz[0] = 1;
		  sz[1] = 2;
		}
		x = 0;
		for (int j = 1;j < n + 1;j++)
		{
		  x += 1.0 * sz[j] / sz[j - 1];
		}
		System.out.printf("%.3lf\n",x);
	  }
	  return 0;
	}

}

