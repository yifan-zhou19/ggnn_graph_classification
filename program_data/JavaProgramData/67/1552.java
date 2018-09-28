package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n??????
		int i;
		double[][] a = new double[10000][2]; //????????????
		double x;
		double y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			a[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		x = a[0][1] / a[0][0];
		for (i = 1; i < n; i++)
		{
			y = a[i][1] / a[i][0];
			if (y - x > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (x - y > 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

