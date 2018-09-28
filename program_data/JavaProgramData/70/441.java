public class dian
{
	public double a;
	public double b;
}

package <missing>;

public class GlobalMembers
{
	public static dian[] dia = tangible.Arrays.initializeWithDefaultdianInstances(20);
	public static void Main()
	{
	int n;
	int i;
	int j;
	double max;
	double dis;
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
			dia[i].a = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			dia[i].b = Double.parseDouble(tempVar3);
		}
	}
	 max = 0;
	for (i = 0;i < n - 1;i++)
	{
	for (j = i + 1;j < n;j++)
	{
		if (((dia[i].a - dia[j].a) * (dia[i].a - dia[j].a) + (dia[i].b - dia[j].b) * (dia[i].b - dia[j].b)) > max)
		{
	 max = (dia[i].a - dia[j].a) * (dia[i].a - dia[j].a) + (dia[i].b - dia[j].b) * (dia[i].b - dia[j].b);
		}
	}
	}
	 dis = Math.sqrt(max);
	System.out.printf("%.4lf",dis);
	}
}

