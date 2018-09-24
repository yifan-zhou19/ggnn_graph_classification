package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		double a;
		double[] s = new double[300];
		double[] b = new double[300];
	int i;
	int j;
	int n;

	s[0] = 1;
	s[1] = 2;
	for (i = 0;i < 298;i++)
	{
		s[i + 2] = s[i] + s[i + 1];
	}
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
			a = Double.parseDouble(tempVar2);
		}
			for (j = 0;j < a;j++)
			{
			  b[i] = b[i] + s[j + 1] / s[j];
			}
	}
	for (i = 0;i < n;i++)

	{
		System.out.printf("%.3lf\n",b[i]);
	}
	return 0;
	}

}

