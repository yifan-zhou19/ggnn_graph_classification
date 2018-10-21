package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[99];
	  int[] b = new int[99];
	  int[] c = new int[99];
	  int[] d = new int[99];
	  int[] e = new int[99];
	  int[] x = new int[99];
	  int i;
	 for (i = 1;i <= 4;i++)
	 {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x[i] = Integer.parseInt(tempVar);
		  }
	 }
	 for (i = 1;i <= 4;i++)
	 {
		if (x[i] > 9999)
		{
		  a[i] = x[i] / 10000;
		  b[i] = (x[i] - a[i] * 10000) / 1000;
		  c[i] = (x[i] - a[i] * 10000 - b[i] * 1000) / 100;
		  d[i] = (x[i] - a[i] * 10000 - b[i] * 1000 - c[i] * 100) / 10;
		  e[i] = (x[i] - a[i] * 10000 - b[i] * 1000 - c[i] * 100 - d[i] * 10);
		  System.out.printf("%d%d%d%d%d\n",e[i],d[i],c[i],b[i],a[i]);
		}
		if (x[i] > 999 && x[i] <= 9999)
		{
		  b[i] = (x[i]) / 1000;
		  c[i] = (x[i] - b[i] * 1000) / 100;
		  d[i] = (x[i] - b[i] * 1000 - c[i] * 100) / 10;
		  e[i] = (x[i] - b[i] * 1000 - c[i] * 100 - d[i] * 10);
		  System.out.printf("%d%d%d%d\n",e[i],d[i],c[i],b[i]);
		}
		if (x[i] > 99 && x[i] <= 999)
		{
		  c[i] = (x[i]) / 100;
		  d[i] = (x[i] - c[i] * 100) / 10;
		  e[i] = (x[i] - c[i] * 100 - d[i] * 10);
		  System.out.printf("%d%d%d\n",e[i],d[i],c[i]);
		}
		if (x[i] > 9 && x[i] <= 99)
		{
		  d[i] = (x[i]) / 10;
		  e[i] = (x[i] - d[i] * 10);
		  System.out.printf("%d%d\n",e[i],d[i]);
		}
		if (x[i] <= 9)
		{
		  e[i] = x[i];
		  System.out.printf("%d\n",e[i]);
		}
	 }
	 return 0;
	}

}

