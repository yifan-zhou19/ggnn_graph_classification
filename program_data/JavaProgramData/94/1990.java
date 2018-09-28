package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int k;
		int[] num = new int[500];
		for (i = 0;i < N;++i)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < N;++i)
		{
			if (num[i] % 2 == 0)
			{
				num[i] = 0;
			}
		}
		sort(num[0], num[0] + N);
		for (i = 0;i < N;++i)
		{
			if (num[i] != 0)
			{
				System.out.print(num[i]);
				k = i;
				break;
			}
		}
		for (i = k + 1;i < N;++i)
		{
			System.out.print(",");
			System.out.print(num[i]);
		}
		return 0;
	}

}

