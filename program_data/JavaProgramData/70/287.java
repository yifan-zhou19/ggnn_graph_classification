package <missing>;

public class GlobalMembers
{
	public static double distance(double a1,double a2,double b1,double b2)
	{
		double c;
		c = Math.sqrt((a1 - b1) * (a1 - b1) + (a2 - b2) * (a2 - b2));
		return (c);

	}

	public static void Main()
	{
		int n;
		int i;
		int j;
		double[][] A = new double[100][2];
		double x;
		double y;

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
				A[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				A[i][1] = Double.parseDouble(tempVar3);
			}

		}


		x = distance(A[0][0], A[0][1], A[1][0], A[1][1]);
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				y = distance(A[i][0], A[i][1], A[j][0], A[j][1]);
				if (y > x)
				{
					x = y;
				}

			}
		}
		System.out.printf("%.4lf\n",x);


	}

}

