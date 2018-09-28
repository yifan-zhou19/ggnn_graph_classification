package <missing>;

public class GlobalMembers
{
	public static final double PI = 3.1415926;
	public static int Main()
	{
		int i;
		double[] a = new double[6];
		for (i = 0;i < 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Double.parseDouble(tempVar);
			}
		}
		double area;
		double s;
		double temp;
		double angle = a[4] / 180 * PI;
		s = (a[0] + a[1] + a[2] + a[3]) / 2;
		temp = (s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3]) - a[0] * a[1] * a[2] * a[3] * Math.cos(angle / 2) * Math.cos(angle / 2);
		if (temp < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f",Math.sqrt(temp));
		}






		return 0;
	}




}

