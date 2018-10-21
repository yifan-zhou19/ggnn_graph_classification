package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] in = new int[1000];
		int[] out = new int[1000];
		int[] time = new int[1000];
		int count = 0;
		int max = 0;
		int i;
		int j;
		char sign;
		for (count = 0; ; count++)
		{
			in[count] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(sign);
			if (sign != ',')
			{
				break;
			}

		}
		for (i = 0; i <= count; i++)
		{
			out[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(sign);
			for (j = in[i]; j < out[i]; j++)
			{
				time[j]++;
			}
		}
		for (i = 0; i <= 999; i++)
		{
			if (time[i] > max)
			{
				max = time[i];
			}
		}
		System.out.print(count + 1);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

