package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int f;
		int m;
		char[][] sex = new char[40][7];
		double[] height = new double[40];
		double[] female = new double[40];
		double[] male = new double[40];
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		f = 0;
		m = 0;
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 sex[i] = tempVar2.charAt(0);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 height[i] = Double.parseDouble(tempVar3);
						 }
						 if (sex[i][0] == 'f')
						 {
											female[f] = height[i];
											f++;
						 }
						 if (sex[i][0] == 'm')
						 {
											male[m] = height[i];
											m++;
						 }
		}
		for (n = 1;n < m;n++)
		{
						 for (i = 0;i < m - n;i++)
						 {
											if (male[i] > male[i + 1])
											{
																  c = male[i];
																  male[i] = male[i + 1];
																  male[i + 1] = c;
											}
						 }
		}
		for (n = 1;n < f;n++)
		{
						 for (i = 0;i < f - n;i++)
						 {
											if (female[i] < female[i + 1])
											{
																  c = female[i];
																  female[i] = female[i + 1];
																  female[i + 1] = c;
											}
						 }
		}
		for (i = 0;i < m;i++)
		{
						 System.out.printf("%.2lf ",male[i]);
		}
		for (i = 0;i < f - 1;i++)
		{
						   System.out.printf("%.2lf ",female[i]);
		}
		System.out.printf("%.2lf",female[i]);
		return 0;
	}
}

