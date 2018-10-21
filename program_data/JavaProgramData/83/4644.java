package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] xf = new int[10];
	int[] cj = new int[10];
	double[] G = new double[10];
	double a = 4.0;
	double b = 3.7;
	double c = 3.3;
	double d = 3.0;
	double e = 2.7;
	double f = 2.3;
	double g = 2.0;
	double h = 1.5;
	double i = 1.0;
	double GPA;
	double sum = 0;
	double J = 0;
	double Z = 0;
	int z = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int l = 0;l < n;l++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(xf[l]) = Integer.parseInt(tempVar2);
		}
	}
	for (int k = 0;k < n;k++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(cj[k]) = Integer.parseInt(tempVar3);
		}
		if (cj[k] >= 90 && cj[k] <= 100)
		{
			G[k] = a;
		}
		else if (cj[k] >= 85 && cj[k] <= 89)
		{
			G[k] = b;
		}
		else if (cj[k] >= 82 && cj[k] <= 84)
		{
			G[k] = c;
		}
		else if (cj[k] >= 78 && cj[k] <= 81)
		{
			G[k] = d;
		}
		else if (cj[k] >= 75 && cj[k] <= 77)
		{
			G[k] = e;
		}
		else if (cj[k] >= 72 && cj[k] <= 74)
		{
			G[k] = f;
		}
		else if (cj[k] >= 68 && cj[k] <= 71)
		{
			G[k] = g;
		}
		else if (cj[k] >= 64 && cj[k] <= 67)
		{
			G[k] = h;
		}
		else if (cj[k] >= 60 && cj[k] <= 63)
		{
			G[k] = i;
		}
		else if (cj[k] < 60)
		{
			G[k] = 0;
		}
	}
	for (int j = 0;j < n;j++)
	{
		J = 1.0 * G[j];
		z = xf[j];
		sum += J * z;
		Z += xf[j];
	}

	System.out.printf("%.2f",GPA = sum / Z);
	return 0;
	}
}

