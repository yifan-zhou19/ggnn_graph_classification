package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k;
		for (k = 1;k <= n;k++)
		{
			int t;
			int i;
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (t == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else
			{
				int[] time = new int[t];
				for (i = 0;i < t;i++)
				{
					time[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (i = 0;i < t;i++)
				{
					if (time[i] + 3 * (i + 1) >= 60)
					{
						if (time[i] + 3 * i <= 60)
						{
							System.out.print(time[i]);
							System.out.print("\n");
						}
						else
						{
							System.out.print(60 - 3 * i);
							System.out.print("\n");
						}
						break;
					}
				}
				if (i == t)
				{
					System.out.print(60 - 3 * t);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

