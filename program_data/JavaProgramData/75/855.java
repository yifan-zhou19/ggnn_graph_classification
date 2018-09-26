package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] come = new int[1000];
		int[] go = new int[1000];
		int i;
		int j;
		int k;
		int p = 0;
		int max = 0;
		for (i = 0; ; i++)
		{
			come[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (i = 0; ; i++)
		{
			go[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (j = 0; j <= 1000; j++)
		{
			for (k = 0; k <= i + 1; k++)
			{
				if (come[k] <= j != 0 && go[k] >= j + 1)
				{
					p = p + 1;
				}
			} // ??????????
			if (max <= p)
			{
				max = p; //?????
			}
			p = 0;
		}
		System.out.print(i + 1);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

