package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t;
		int max = 0;
		int[] in = new int[1000];
		int[] out = new int[1000];
		int[] num_t = new int[1000];
		char a;
		for (i = 0; ; i++)
		{
			in[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(a);
			if (a == '\n')
			{
				break;
			}
		}
		for (i = 0; ; i++)
		{
			out[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cin.get(a);
			if (a == '\n')
			{
				break;
			}
		}

		i++;


		System.out.print(i);
		System.out.print(" ");
		for (j = 0; j < i; j++)
		{
			for (t = in[j]; t < out[j]; t++)
			{
				num_t[t]++;
			}
		}
		for (t = 0; t < 1000; t++)
		{
			if (num_t[t] > max)
			{
				max = num_t[t];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

