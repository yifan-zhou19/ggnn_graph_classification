package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int time;
		int times;
		int[] a = new int[20];
		int sum;
		int i;
		int x;
		int lost;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < n;k++)
		{
			time = 0;
			sum = 0;
			x = 0;
			lost = 0;
			i = 0;
			times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (times == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (i = 0;i < times;i++)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					lost = lost + 3;
					time = lost + a[i];
					if (time >= 60)
					{
						if (time >= 63)
						{
							System.out.print(a[i] + 60 - time+3);
							System.out.print("\n");
						}
						else
						{
							System.out.print(a[i]);
							System.out.print("\n");
						}
						x = 1;
						if (i < times - 1)
						{
							for (int j = i + 1;j < times;j++)
							{
								a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
							}
						}
						break;
					}
				}
				if (x == 0)
				{
					System.out.print(a[times - 1] + 60 - time);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

