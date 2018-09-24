package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int x = 0;
	int y = 0;
	double[] su = new double[40];
	double[] zu = new double[40];
	double a;
	double b;
	double[] tu = new double[40];
	char[][] af = new char[40][10];
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
		af[i] = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		su[i] = Double.parseDouble(tempVar3);
	}
	if (String.valueOf(af[i]).length() == 4)
	{
		zu[x] = su[i];
		x++;
	}
	else if (String.valueOf(af[i]).length() == 6)
	{
		tu[y] = su[i];
		y++;
	}
	}
	for (k = 1;k < x;k++)
	{
	for (i = 0;i < x - k;i++)
	{
	if (zu[i + 1] < zu[i])
	{
		a = zu[i];
	zu[i] = zu[i + 1];
	zu[i + 1] = a;
	}
	}
	}
	for (k = 1;k < y;k++)
	{
	for (i = 0;i < y - k;i++)
	{
	if (tu[i + 1] > tu[i])
	{
		b = tu[i];
	tu[i] = tu[i + 1];
	tu[i + 1] = b;
	}
	}
	}
	System.out.printf("%.2lf",zu[0]);
	for (k = 1;k < x;k++)
	{
	System.out.printf(" %.2lf",zu[k]);
	}
	for (k = 0;k < y;k++)
	{
	System.out.printf(" %.2lf",tu[k]);
	}
	return 0;
	}

}

