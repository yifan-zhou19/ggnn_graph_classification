package <missing>;

public class GlobalMembers
{
	public static void input()
	{
		for (i = 1; i <= 6; i++)
		{
			in[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}
	public static void reverse()
	{
		int negative = 0;
		for (i = 1; i <= 6; i++)
		{
			negative = 0;
			if (in[i] == 0)
			{
				continue;
			}
			if (in[i] < 0)
			{
				negative = 1;
				in[i] = -in[i];
			}
			while (in[i] != 0)
			{
				out[i] = out[i] * 10 + in[i] % 10;
				in[i] /= 10;
			}
			if (negative == 1)
			{
				out[i] = -out[i];
			}
		}
	}
	public static void output()
	{
		for (i = 1; i <= 6; i++)
		{
			System.out.print(out[i]);
			System.out.print("\n");
		}
	}

	public static int i;
	public static int j;
	public static int k;
	public static int[] in = new int[7];
	public static int[] out = new int[7];

	public static int Main()
	{
		input();

		reverse();

		output();

		return 0;
	}

}

