package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		double[][] k = new double[100][10];
		double t;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k[i][0] = Double.parseDouble(tempVar2);
			}
			for (j = 1; j <= k[i][0]; j++)
			{
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 k[i][j] = Double.parseDouble(tempVar3);
				 }
			}
		}
		 for (p = 0; p < n; p++)
		 {
			 for (q = 1; q <= k[p][0]; q++)
			 {
				 t = 0;
				 t += (k[p][q] + 3 * q);
				 if (t == 61 || t == 62 || t == 63)
				 {

					 System.out.printf("%g\n", k[p][q]);
					 break;
				 }
				 else if (t >= 64)
				 {
					 e = 63 - q * 3;
					 System.out.printf("%g\n", e);
					 break;
				 }
			 }
			 if (t <= 60)
			 {
				System.out.printf("%g\n",(60 - 3 * k[p][0]));
			 }
		 }
		return 0;
	}
}

