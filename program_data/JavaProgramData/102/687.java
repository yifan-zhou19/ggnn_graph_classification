package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  char[][] xb = new char[40][8];
	  double[] h = new double[40];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			xb[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			h[i] = Double.parseDouble(tempVar3);
		}
	  }
	  double[] mh = new double[40];
	  double[] fh = new double[40];
	  int m = 0;
	  int f = 0;
	  final String bx = "male";
	  for (i = 0;i < n;i++)
	  {
	   if (strcmp(xb[i],bx) == 0)
	   {
		 mh[m] = h[i];
		 m++;
	   }
	   else
	   {
		 fh[f] = h[i];
		 f++;
	   }
	  }
	  for (int p = 1;p <= m;p++)
	  {
	   for (i = 0;i < m - p;i++)
	   {
		 if (mh[i] > mh[i + 1])
		 {
		 double e;
		 e = mh[i];
		 mh[i] = mh[i + 1];
		 mh[i + 1] = e;
		 }
	   }
	  }
	  for (int a = 1;a <= f;a++)
	  {
	   for (i = 0;i < f - a;i++)
	   {
		 if (fh[i] < fh[i + 1])
		 {
		 double e;
		 e = fh[i];
		 fh[i] = fh[i + 1];
		 fh[i + 1] = e;
		 }
	   }
	  }
	  for (i = 0;i < m;i++)
	  {
	   System.out.printf("%.2lf ",mh[i]);
	  }
	  for (i = 0;i < f - 1;i++)
	  {
	   System.out.printf("%.2lf ",fh[i]);
	  }
	  System.out.printf("%.2lf",fh[f - 1]);
	  return 0;
	}

}

