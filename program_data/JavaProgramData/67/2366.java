package <missing>;

public class GlobalMembers
{
	/************?????****************
	??????????
	**************************************/
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] all = new double[n]; //all????effective????
		double[] eff = new double[n];
		double[] per = new double[n]; //percent ?????
		all[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		eff[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		per[0] = eff[0] / all[0];
		for (int i = 1;i < n;i++)
		{
			all[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			eff[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			per[i] = eff[i] / all[i];
			if (per[i] - per[0] > 0.05)
			{
			   System.out.print("better");
			   System.out.print("\n");
			}
			else
			{
				 if (per[0] - per[i] > 0.05)
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
		}
		return 0;
	}

}

