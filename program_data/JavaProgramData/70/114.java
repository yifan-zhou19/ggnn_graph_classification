package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a;
		double b;
		double t;
		double max = 0.0;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		double[][] s = new double[100][2];

		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i][1] = Double.parseDouble(tempVar3);
			}
		}

		for (j = 0;j <= n - 2;j++)
		{
			for (i = 0;i <= n - j - 1;i++)
			{
				a = (s[j][0] - s[j + i][0]) * (s[j][0] - s[j + i][0]);
				b = (s[j][1] - s[j + i][1]) * (s[j][1] - s[j + i][1]);
				t = Math.sqrt(a + b);
				if (t > max)
				{
				max = t;
				}
			}



		}

		System.out.printf("%.4f\n",max);


	}


}

