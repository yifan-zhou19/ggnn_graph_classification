package <missing>;

public class GlobalMembers
{
	//????




	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int failure; //????????????????????
			int[] times = new int[21];
			int time;
			int number;
			failure = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (failure == 0)
			{
				number = 60;
			}
			else
			{
				for (int j = 0;j < failure;j++)
				{
					times[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (int j = 0;j < failure && times[j] + 3 * j < 60;j++) //??times[j]+3*j<60??????????
				{
						if (times[j] + 3 * (j + 1) < 60) //times[j]+3*(j+1)<60,??????????????
						{
						   number = times[j] + 60 - (times[j] + 3 * (j + 1));
						}
						else
						{
							number = times[j];
						}
				}
			}
			 System.out.print(number);
			 System.out.print("\n");
		}

		return 0;
	}
}

