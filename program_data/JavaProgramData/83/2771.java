package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] xf = new int[10];
	int n;
	int s;
	int i;
	double gpa;
	double sumxuefen;
	double sumxuefenjidian;
	sumxuefen = 0;
	sumxuefenjidian = 0;
	gpa = 0;
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
		xf[i] = Integer.parseInt(tempVar2);
	}
	sumxuefen += xf[i];
	}
	for (i = 0;i < n;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		s = Integer.parseInt(tempVar3);
	}
	if (s >= 90 && s <= 100)
	{
		sumxuefenjidian += 4 * xf[i];
	}
	if (s >= 85 && s <= 89)
	{
		sumxuefenjidian += 3.7 * xf[i];
	}
	if (s >= 82 && s <= 84)
	{
		sumxuefenjidian += 3.3 * xf[i];
	}
	if (s >= 78 && s <= 81)
	{
		sumxuefenjidian += 3.0 * xf[i];
	}
	if (s >= 75 && s <= 77)
	{
		sumxuefenjidian += 2.7 * xf[i];
	}
	if (s >= 72 && s <= 74)
	{
		sumxuefenjidian += 2.3 * xf[i];
	}
	if (s >= 68 && s <= 71)
	{
		sumxuefenjidian += 2.0 * xf[i];
	}
	if (s >= 64 && s <= 67)
	{
		sumxuefenjidian += 1.5 * xf[i];
	}
	if (s >= 60 && s <= 63)
	{
		sumxuefenjidian += 1.0 * xf[i];
	}
	if (s <= 59)
	{
		sumxuefenjidian += 0 * xf[i];
	}
	}
	gpa = sumxuefenjidian / sumxuefen;
	System.out.printf("%.2lf",gpa);
	}
}

