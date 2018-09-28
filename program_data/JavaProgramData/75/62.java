package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] in = new int[1005];
		int[] out = new int[1005];
		int num = 0;
		int[] count = new int[1005];
		int max = 0;
		char f;
		while (true)
		{
			in[num++] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (int i = 0; i < num; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				out[i] = Integer.parseInt(tempVar);
			}
			System.in.read();
			for (int j = in[i]; j < out[i]; j++)
			{
				count[j]++;
			}
		}
		for (int i = 0; i < 1001; i++)
		{
			if (max < count[i])
			{
				max = count[i];
			}
		}
		System.out.print(num);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

