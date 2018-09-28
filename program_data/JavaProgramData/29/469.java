package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int[] sz = new int[100];
	  double k;
	  k = 0.0;
	  double fz = 2.0;
	  double fm = 1.0;
	  double j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (int i = 0;i < m;i++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 sz[i] = Integer.parseInt(tempVar2);
		 }
	  }
	  for (int y = 0;y < m;y++)
	  {
		  for (int x = 0;x < sz[y];x++)
		  {
			  k = k + (fz / fm);
			  j = fz;
			  fz = fm + j;
			  fm = j;
		  }
		  fz = 2.0;
		  fm = 1.0;
		  System.out.printf("%.3lf\n",k);
		  k = 0.0;
	  }
	  return 0;
	}


}

