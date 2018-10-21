package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[n];
		double[] b = new double[n];
		double[] c = new double[n];
		a[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		c[0] = b[0] / a[0];
		int i;
		for (i = 1;i < n;i++)
		{
		a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	   c[i] = b[i] / a[i];
	   if (c[i] - c[0] > 0.05)
	   {
		   System.out.print("better");
		   System.out.print("\n");
	   }
	   if (c[i] - c[0] < -0.05.getValue() != 0)
	   {
		   System.out.print("worse");
		   System.out.print("\n");
	   }
	   if (c[i] - c[0] > -0.05 && c[i] - c[0] < 0.05)
	   {
		   System.out.print("same");
		   System.out.print("\n");
	   }
		}



	}

}

