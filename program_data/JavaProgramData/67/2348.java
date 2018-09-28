package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[n]; //a????b????
		double[] b = new double[n];
		double[] c = new double[n]; //????????
		for (i = 0;i < n;i++)
		{
						a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
						b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
						c[i] = b[i] / a[i];
		}
		for (i = 1;i < n;i++)
		{
						if (c[i] - c[0] > 0.05)
						{
										  System.out.print("better");
										  System.out.print("\n");
						} //??y-x??5%??????
						else if (c[0] - c[i] > 0.05)
						{
										  System.out.print("worse");
										  System.out.print("\n");
						} //??x-y??5%??????
						else
						{
										  System.out.print("same");
										  System.out.print("\n");
						} //?????????
		}
		return 0;
	}

}

