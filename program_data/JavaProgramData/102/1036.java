package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int f;
		char t;
		double e;
		double d;
		char[][] a = new char[40][7];
		double[] b = new double[40];
		double[] male = new double[40];
		double[] female = new double[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			t = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			b[i] = Double.parseDouble(tempVar4);
		}
		}
		j = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
		if (a[i][0] == 'm')
		{
			male[j] = b[i];
			j++;
		}
		if (a[i][0] == 'f')
		{
			female[k] = b[i];
			k++;
		}
		}
		for (i = 0;i < j;i++)
		{
						 for (m = i;m < j;m++)
						 {
										  if (male[m] < male[i])
										  {
															  e = male[m];
															  male[m] = male[i];
															  male[i] = e;
										  }
						 }
		}
		for (i = 0;i < k;i++)
		{
						 for (f = i;f < k;f++)
						 {
										  if (female[f] > female[i])
										  {
															  d = female[f];
															  female[f] = female[i];
															  female[i] = d;
										  }
						 }
		}
						 if (male[0].getValue() != 0)
						 {
							 System.out.printf("%.2lf",male[0]);
						 }
		for (i = 1;i < j;i++)
		{
						 System.out.printf(" %.2lf",male[i]);
		}
		for (i = 0;i < k;i++)
		{
						 System.out.printf(" %.2lf",female[i]);
		}

		return 0;
	}

}

