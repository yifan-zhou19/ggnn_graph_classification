package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] start = new int[1000];
		int[] end = new int[1000];
		int num = 0;
		int i;
		int j;
		int max = 0;
		int total;
		char c;
		for ((start[num - 1], (c = cin.peek() == ','); cin = ConsoleInput.readToWhiteSpace(true)).length() > 0 && (c, num++ = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			;
		}
		end[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i < num; i++)
		{
			c = ConsoleInput.readToWhiteSpace(true).charAt(0);
			end[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < 1000; i++)
		{
			total = 0;
			for (j = 0; j < num; j++)
			{
				if (start[j] <= i != 0 && i < end[j])
				{
					total++;
				}
			}
			if (total > max)
			{
				max = total;
			}
		}
		System.out.print(num);
		System.out.print(' ');
		System.out.print(max);
		return 0;
	}

}

