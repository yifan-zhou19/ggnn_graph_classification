package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		int[] a = new int[10];
		int[] b = new int[10];
		double s = 0;
		double GPA;
		double[] m = new double[10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum += a[i];
		}
		for (i = 0;i < n;i++)
		{
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] < 60)
			{
		m[i] = 0;
			}
		else if ((b[i] >= 60) && (b[i] <= 63))
		{
			m[i] = 1.0 * a[i];
		}
		else if ((b[i] >= 64) && (b[i] <= 67))
		{
			m[i] = 1.5 * a[i];
		}
		else if ((b[i] >= 68) && (b[i] <= 71))
		{
			m[i] = 2.0 * a[i];
		}
		else if ((b[i] >= 72) && (b[i] <= 74))
		{
			m[i] = 2.3 * a[i];
		}
		else if ((b[i] >= 75) && (b[i] <= 77))
		{
			m[i] = 2.7 * a[i];
		}
		else if ((b[i] >= 78) && (b[i] <= 81))
		{
			m[i] = 3.0 * a[i];
		}
		else if ((b[i] >= 82) && (b[i] <= 84))
		{
			m[i] = 3.3 * a[i];
		}
		else if ((b[i] >= 85) && (b[i] <= 89))
		{
			m[i] = 3.7 * a[i];
		}
		else if ((b[i] >= 90) && (b[i] <= 100))
		{
			m[i] = 4.0 * a[i];
		}
		}
		for (i = 0;i < n;i++)
		{
			s += m[i];
		}
		GPA = s / sum;
		System.out.printf("%.2f", GPA);
		return 0;
	}


}

