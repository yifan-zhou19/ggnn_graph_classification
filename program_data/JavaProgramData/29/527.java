package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] sz = new int[100];
	 int m;
	 int i;
	 int n;
	 int k;
	 double r;
	 r = 0;
	 sz[0] = 1;
	 sz[1] = 2;
	 for (i = 2;i < 100;i++)
	 {
		sz[i] = sz[i - 1] + sz[i - 2];
	 }
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 for (k = 0;k < m;k++)
	 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		   r += sz[i + 1] * 1.00000 / sz[i] * 1.0000;
		}
		System.out.printf("%.3lf\n",r);
		r = 0;
	 }
		return 0;
	}

}

