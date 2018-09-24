package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		double[] A = new double[100];
		double[] s = new double[100];
		double a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			a = 0;
			s[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					A[j] = Double.parseDouble(tempVar3);
				}
				a = a + A[j];
			}
			a = a / n;
			for (j = 0;j < n;j++)
			{
				s[i] = (A[j] - a) * (A[j] - a) + s[i];
			}
			s[i] = Math.sqrt(s[i] / n);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5f\n",s[i]);
		}





		return 0;
	}


}

