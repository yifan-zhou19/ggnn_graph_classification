package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] xf = new int[10];
		int[] u = new int[10];
		double[] sz = new double[10];
		double[] xfjd = new double[10];
		double sum;
		double k;
		double GPA;
		sum = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   xf[i] = Integer.parseInt(tempVar2);
		   }
		}
		for (i = 0;i < n;i++)
		{
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   u[i] = Integer.parseInt(tempVar3);
		   }
		}
		for (i = 0;i < n;i++)
		{
			 if (u[i] >= 90)
			 {
			  sz[i] = 4.0;
			 }
			 else if (u[i] < 90 && u[i] >= 85)
			 {
			  sz[i] = 3.7;
			 }
			 else if (u[i] < 85 && u[i] >= 82)
			 {
				sz[i] = 3.3;
			 }
			 else if (u[i] < 82 && u[i] >= 78)
			 {
				  sz[i] = 3.0;
			 }
			 else if (u[i] < 78 && u[i] >= 75)
			 {
					sz[i] = 2.7;
			 }
			 else if (u[i] < 75 && u[i] >= 72)
			 {
					  sz[i] = 2.3;
			 }
			 else if (u[i] < 72 && u[i] >= 68)
			 {
					sz[i] = 2.0;
			 }
			 else if (u[i] < 68 && u[i] >= 64)
			 {
						  sz[i] = 1.5;
			 }
			   else if (u[i] < 64 && u[i] >= 60)
			   {
							sz[i] = 1.0;
			   }
				else
				{
							  sz[i] = 0;
				}
				xfjd[i] = sz[i] * xf[i];
				sum += xfjd[i];
				k += xf[i];

		}
		GPA = sum / k;
		System.out.printf("%.2lf",GPA);
		return 0;
	}
}

