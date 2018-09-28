package <missing>;

public class GlobalMembers
{
	public static double average(tangible.RefObject<Double> p, int n)
	{
		int i;
		double sum = 0;
		for (i = 1;i <= n;i++)
		{
			sum = sum + *(p.argValue + i);
		}
		return sum / n;
	}
	public static double add(tangible.RefObject<Double> p, double x, int n)
	{
		int i;
		double sum = 0;
		for (i = 1;i <= n;i++)
		{
			sum = sum + (*(p.argValue + i) - x) * (*(p.argValue + i) - x);
		}
		sum = Math.sqrt(sum / n);
		return sum;
	}
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[1500];
		double x;
		double y;
		for (j = 1;j <= m;j++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1;i <= n;i++)
			{
				a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		tangible.RefObject<Double> tempRef_a = new tangible.RefObject<Double>(a);
			x = average(tempRef_a, n);
			a = tempRef_a.argValue;
		tangible.RefObject<Double> tempRef_a2 = new tangible.RefObject<Double>(a);
			y = add(tempRef_a2, x, n);
			a = tempRef_a2.argValue;
			System.out.printf("%.5f", y);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}




}

