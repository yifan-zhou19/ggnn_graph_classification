package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] age = new int[100];
	int[] num = {0, 0, 0, 0};
	double[] p = new double[4];
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		age[i] = Integer.parseInt(tempVar2);
	}
	}
	for (int i = 0;i < n;i++)
	{
	if (age[i] <= 18)
	{
	num[0]++;
	}
	else if (age[i] <= 35 && age[i >= 19] != 0)
	{
	num[1]++;
	}
	else if (age[i] <= 60 && age[i] >= 36)
	{
	num[2]++;
	}
	else
	{
	num[3]++;
	}
	}
	for (int i = 0;i < 4;i++)
	{
	p[i] = num[i] * 100.0 / (n * 1.0);
	}
	System.out.printf("1-18: %.2lf%%\n",p[0]);
	System.out.printf("19-35: %.2lf%%\n",p[1]);
	System.out.printf("36-60: %.2lf%%\n",p[2]);
	System.out.printf("Over60: %.2lf%%",p[3]);
	return 0;
	}


}

