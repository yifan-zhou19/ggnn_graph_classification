package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int s;
		double ds = 0;
		s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
		double[] c = new double[n];
		double[] d = new double[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
		}
		 for (i = 0;i < n;i++)
		 {
			 s = s + a[i];
		 }
		 for (i = 0;i < n;i++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 b[i] = Integer.parseInt(tempVar3);
			 }
			 if (b[i] <= 100 && b[i] >= 90)
			 {
				 c[i] = 4.0;
			 }
			 else if (b[i] <= 89 && b[i] >= 85)
			 {
				 c[i] = 3.7;
			 }
			 else if (b[i] <= 84 && b[i] >= 82)
			 {
				 c[i] = 3.3;
			 }
			 else if (b[i] <= 81 && b[i] >= 78)
			 {
				 c[i] = 3.0;
			 }
			 else if (b[i] <= 77 && b[i] >= 75)
			 {
				 c[i] = 2.7;
			 }
			 else if (b[i] <= 74 && b[i] >= 72)
			 {
				 c[i] = 2.3;
			 }
			 else if (b[i] <= 71 && b[i] >= 68)
			 {
				 c[i] = 2.0;
			 }
			 else if (b[i] <= 67 && b[i] >= 64)
			 {
				 c[i] = 1.5;
			 }
			 else if (b[i] <= 63 && b[i] >= 60)
			 {
				 c[i] = 1.0;
			 }
			 else if (b[i] < 60)
			 {
				 c[i] = 0;
			 }
			 d[i] = 1.0 * a[i] * c[i];
		 }
		 for (i = 0;i < n;i++)
		 {
			ds = ds + d[i];
		 }
		 System.out.printf("%.2lf",1.0 * ds / s);
		return 0;
	}

}

