package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] sum = new double[10001];
		double[] eff = new double[10001];
		double sum1;
		double eff1;
		double[] per = new double[10001];
		double std;
		int n;
		int temp;
		int i;
		int j;



		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum1 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		eff1 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		std = eff1 / sum1;
			for (i = 1;i <= n - 1;i++)
			{


						sum[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
						eff[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
						per[i] = eff[i] / sum[i];
						if (per[i] - std > 0.05)
						{
							System.out.print("better");
							System.out.print("\n");
						}
						else if (std - per[i] > 0.05)
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

