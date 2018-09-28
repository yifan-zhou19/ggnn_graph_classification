package <missing>;

public class GlobalMembers
{
	//????


	public static int Main()
	{
		int n; //?? ?? ?? ???? ??????
		int[] high = new int[100];
		int[] low = new int[100];
		int count = 0;
		int time_max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++) //????
		{
			high[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			low[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			if (high[i] >= 90 && high[i] <= 140 && low[i] >= 60 && low[i] <= 90) //?????????????+1
			{
				count += 1;
				if (i == n - 1)
				{
					time_max = (count > time_max)?count:time_max;
				}
			}
			else //??????????????????????????
			{
				time_max = (count > time_max)?count:time_max;
				count = 0; //??????
			}
		}
			System.out.print(time_max);
			System.out.print("\n");
		return 0;
	}

}

