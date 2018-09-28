package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (n - .0.getValue() != 0)
	{
		int stop;
		int[] num = new int[60];
		int beat = 60;
		stop = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < stop;i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < stop;i++)
		{
			if (num[i] + 3 * (i + 1) <= 60)
			{
						beat = 60 - 3 * (i + 1);
			}
					else if (num[i] + 3 * i >= 60)
					{
						beat = beat = 60 - 3 * (i);
						break;
					}
					else
					{
						beat = num[i];
						break;
					}
		}
		System.out.print(beat);
		System.out.print("\n");
	}
	return 0;
	}

}

