package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		double[] all = new double[100]; //??????????????????
		double[] good = new double[100];
		double[] rate = new double[100]; //????????
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		all[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		good[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		rate[0] = good[0] / all[0]; //????
		//cout<<rate[0];
		for (i = 1;i < k;i++)
		{
			all[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			good[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			rate[i] = good[i] / all[i]; //??????
			//cout<<rate[i];
			if ((rate[i] - rate[0]) > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if ((rate[0] - rate[i]) > 0.05)
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

