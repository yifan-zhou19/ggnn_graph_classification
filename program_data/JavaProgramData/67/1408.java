package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[][] sz = new int[1000][2];
	  int a;
	  int b;
	  int c;
	  int d;
	  double[] jieguo = new double[1000];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (a = 0;a < n;a++)
	  {
	   for (b = 0;b < 2;b++)
	   {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[a][b] = Integer.parseInt(tempVar2);
		}
	   }
	  }
	  for (c = 0;c < n;c++)
	  {
	   jieguo[c] = ((1.0 * sz[c][1]) / (1.0 * sz[c][0])) * 100.0;
	  }
	  for (d = 1;d < n;d++)
	  {
		if (jieguo[d] - jieguo[0] > 5)
		{
		 System.out.print("better\n");
		}
		else if (jieguo[d] - jieguo[0] < -5)
		{
		 System.out.print("worse\n");
		}
		else if ((jieguo[d] - jieguo[0] > -5.0) && (jieguo[d] - jieguo[0] <= 5.0))
		{
		 System.out.print("same\n");
		}
	  }
	  return 0;
	}
}

