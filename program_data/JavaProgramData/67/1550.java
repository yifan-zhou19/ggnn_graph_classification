package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] a = new double[100];
		double[] b = new double[100];
		double standard;
		double[] c = new double[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		standard = a[0] / b[0];
		for (i = 1;i < n;i++)
		{
			c[i] = a[i] / b[i];
		}
		for (i = 1;i < n;i++)
		{
			if (standard - c[i] > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			if (standard - c[i] < -0.05.getValue() != 0)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			if (standard - c[i] > -0.05 && standard - c[i] < 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}



}

