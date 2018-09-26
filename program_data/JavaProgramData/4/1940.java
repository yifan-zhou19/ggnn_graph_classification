package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[104][104];
		int h;
		int l;
		h = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 104;i++)
		{
			for (int k = 0 ;k < 104 ;k++)
			{
				a[i][k] = -999;
			}
		}
		for (int i = 1;i <= h;i++)
		{
			for (int k = 1 ;k <= l ;k++)
			{
				a[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int printer = a[1][1];
		for (int i = 1;i <= l;i++)
		{
			int k = 0;
			printer = a[1 + k][i - k];
			while (printer != -999)
			{
				System.out.print(printer);
				System.out.print("\n");
				k++;
				printer = a[1 + k][i - k];
			}
		}
		for (int i = 2;i <= h;i++)
		{
			int k = 0;
			printer = a[i + k][l - k];
			while (printer != -999)
			{
				System.out.print(printer);
				System.out.print("\n");
				k++;
				printer = a[i + k][l - k];
			}
		}
		return 0;
	}


}

