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
	float sum = 0F;
	int a;
	double m = 0;
	int i = 1;
	int b;
	double c;
	double d;

	int[] score = new int[100];
	while (i <= n)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		score[i] = a;
		m += a;
		i++;
	}
	   int j = 1;
	while (j <= n)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (b > 89)
		{
			c = 4.0;
		}
		else if (b > 84)
		{
			c = 3.7;
		}
	else if (b > 81)
	{
		c = 3.3;
	}
	else if (b > 77)
	{
		c = 3.0;
	}
	else if (b > 74)
	{
		c = 2.7;
	}
	else if (b > 71)
	{
		c = 2.3;
	}
	else if (b > 67)
	{
		c = 2.0;
	}
	else if (b > 63)
	{
		c = 1.5;
	}
	else if (b > 59)
	{
		c = 1.0;
	}
	else
	{
		c = 0;
	}
	sum += c * score[j];
	j++;
	}
	d = sum / m;
	System.out.printf("%.2lf",d);
	return 0;
	}
}

