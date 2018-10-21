package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	double GPA;
	double num;
	double[] score = new double[10];
	int[] point = new int[10];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	i = 0;
	while (i < n)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			point [i] = Integer.parseInt(tempVar2);
		}
		i++;
	}
	i = 0;
	while (i < n)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			score [i] = Double.parseDouble(tempVar3);
		}
		i++;
	}
	i = 0;
	while (i < n)
	{
		if (score [i] >= 90)
		{
			score [i] = 4.0;
		}
		else if (score [i] < 90 && score [i] >= 85)
		{
			score [i] = 3.7;
		}
		else if (score [i] < 85 && score [i] >= 82)
		{
			score [i] = 3.3;
		}
		else if (score [i] < 82 && score [i] >= 78)
		{
			score [i] = 3.0;
		}
		else if (score [i] < 78 && score [i] >= 75)
		{
			score [i] = 2.7;
		}
		else if (score [i] < 75 && score [i] >= 72)
		{
			score [i] = 2.3;
		}
		else if (score [i] < 72 && score [i] >= 68)
		{
			score [i] = 2.0;
		}
		else if (score [i] < 68 && score [i] >= 64)
		{
			score [i] = 1.5;
		}
		else if (score [i] < 64 && score [i] >= 60)
		{
			score [i] = 1.0;
		}
		else
		{
			score [i] = 0;
		}
		i++;
	}
	i = 0;
	num = 0;
	while (i < n)
	{
		num = (score [i]) * (point [i]) + num;
		i++;
	}
	i = 0;
	a = 0;
	while (i < n)
	{
		a = (point [i]) + a;
		i++;
	}
	GPA = num / a;
	System.out.printf("%.2lf\n",GPA);
	return 0;
	}
}

