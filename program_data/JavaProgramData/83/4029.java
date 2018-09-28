package <missing>;

public class GlobalMembers
{
	public static double cl(int a)
	{
		if (a >= 90)
		{
			return 4;
		}
		if (a >= 85)
		{
			return 3.7;
		}
		if (a >= 82)
		{
			return 3.3;
		}
		if (a >= 78)
		{
			return 3;
		}
		if (a >= 75)
		{
			return 2.7;
		}
		if (a >= 72)
		{
			return 2.3;
		}
		if (a >= 68)
		{
			return 2;
		}
		if (a >= 64)
		{
			return 1.5;
		}
		if (a >= 60)
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	double[] f = new double[10];
	double s = 0;
	for (int i = 0;i < n;i++)
	{
		f[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		s += f[i];
	}
	double gpa = 0;
	for (int i = 0;i < n;i++)
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		gpa += cl(a) * f[i];
	}
	System.out.printf("%.2f",gpa / s);
	return 0;
	}
}

