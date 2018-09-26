package <missing>;

public class GlobalMembers
{
	//*****************************************************************************
	//??????????? 
	//?????? 
	//???9-27 
	//*****************************************************************************

	public static int Main()
	{
		int n; //???????n
		int[] all = new int[100]; //?????????????????????
		double[] suv = new double[100];
		double[] rate = new double[100];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < n ; i++) //???????????
		{
		all[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		suv[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		rate[i] = suv[i] / all[i];
		}

		for (int j = 1; j < n; j++)
		{
			if (rate[j] - rate[0] > 0.05)
			{
			System.out.print("better");
			System.out.print("\n");
			}

			else if (rate[0] - rate[j] > 0.05)
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

