package <missing>;

public class GlobalMembers
{
	public static double dis(double a,double b,double c,double d)
	{
		return (Math.sqrt((a - c) * (a - c) + (b - d) * (b - d)));
	}
	public static int Main()
	{
		double[][] a = new double[100][2];
		double temp1;
		double n;
		int i;
		int j;
		n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		temp1 = 0;
		for (i = 0;i < n;i++)
		{
			a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (temp1 < dis(a[i][0], a[i][1], a[j][0], a[j][1]))
				{
					temp1 = dis(a[i][0], a[i][1], a[j][0], a[j][1]);
				}
			}
		}
		System.out.print(temp1);
		System.out.print("\n");
		return 0;
	}
}

