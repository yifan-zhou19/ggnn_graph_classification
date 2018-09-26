package <missing>;

public class GlobalMembers
{
	public static float[] b = new float[100];
	public static int he(int n,int m)
	{
	 int i;
	 int k;
	 int f1 = 1;
	 int f2 = 2;
	  b[m] = 0.0F;
	 for (i = 1;i <= n;i++)
	 {
	  b[m] = b[m] + f2 * 1.0 / f1;
	  k = f1;
	  f1 = f2;
	  f2 = k + f2;
	 }
	 return 0;
	}

	public static void Main(String[] args)
	{
	  int m;
	  int[] a = new int[100];
	  int i;
	  int he = new int(int x,int i);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= m;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[i] = Integer.parseInt(tempVar2);
		  }
		  he(a[i], i);
	  }
	  for (i = 1;i <= m;i++)
	  {
		  System.out.printf("%.3f\n",b[i]);
	  }
	}
}

