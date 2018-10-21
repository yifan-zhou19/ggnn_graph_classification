package <missing>;

public class GlobalMembers
{
	//?????
	public static int Main()
	{
		int n = 0;
		int[][] test = new int[50][2]; //??????????????????
		double[] rate = new double[50]; //?????
		int count = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (count = 0;count < n;count++)
		{
			test[count][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			test[count][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		for (count = 0;count < n;count++) //?????????
		{
			rate[count] = (double)test[count][1] / test[count][0];
		}

		for (count = 1;count < n;count++)
		{
			if (rate[count] - rate[0] > 0.05) //????
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else
			{
				if (rate[0] - rate[count] > 0.05) //????
				{
					System.out.print("worse");
					System.out.print("\n");
				}
				else //?????
				{
					System.out.print("same");
					System.out.print("\n");
				}
			}
		}

		return 0;
	}
}

