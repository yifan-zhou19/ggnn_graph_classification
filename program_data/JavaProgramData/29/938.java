package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] a = new int[41];
	   float t = 0F;
	   float[] b = new float[40];
	   int n;
	   int i;
	   int m;
	   a[0] = 1;
	   a[1] = 2;
	   for (i = 2;i < 41;i++)
	   {
		a[i] = a[i - 1] + a[i - 2];
	   }
		for (i = 0;i < 40;i++)
		{
		  b[i] = (float)a[i + 1] / a[i] + b[i - 1];
		}
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		for (i = 0;i < m;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		System.out.printf("%.3f\n",b[n - 1]);
		}
		 return 0;
	}

}

