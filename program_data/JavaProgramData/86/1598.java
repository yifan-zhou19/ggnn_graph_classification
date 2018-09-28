package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int t = 0;t < n;t++)
		{
			int time = 0;
			int ans = 0;
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[] point = new int[100];
			for (int i = 0;i < m;i++)
			{
				point[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int i = 0;i < m;i++)
			{
				time += point[i] - ans; //??????
				if (time > 60) //?????????
				{
					ans = point[i] - (time-60);
					break;
				}
				else
				{
					ans = point[i]; //??????
				}
				time += 3; //????????
				if (time > 60)
				{
					break; //?????????
				}
			}
			if (time < 60)
			{
				ans += 60 - time; //??????????
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}

}

