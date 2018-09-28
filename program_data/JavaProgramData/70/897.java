package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	double[][] a = new double[100][2];
	double m;
	double dis;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i <= n;i++)
	{
	a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	}
	m = 0;
	for (i = 0;i < n;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	dis = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
	if (dis > m)
	{
	m = dis;
	}
	}
	}
	System.out.print(m);
	System.out.print("\n");
	return 0;
	}


}

