package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int j;
	  int i;
	  int[] b = new int[1000];
	  double[] a = new double[1000];
	  double s = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (j = 0;j < m;j++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[j] = Integer.parseInt(tempVar2);
		}
	  }
	  for (j = 0;j < m;j++)
	  {
		 for (i = 0;i < b[j];i++)
		 {
			a[0] = 2 / 1;
			a[i + 1] = 1 + 1 / a[i];
			s += a[i];
		 }
		 System.out.printf("%.3lf\n",s);
		 s = 0;
	  }
	  return 0;
	}


}

