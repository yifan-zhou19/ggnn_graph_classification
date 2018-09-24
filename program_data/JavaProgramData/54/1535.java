package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] monkey = new int[1000];
		int n;
		int k;
		int i = 3;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		monkey[n] = k;
		while (i >= 1) //??i?????
		{
			monkey[n] += n;
			for (i = n - 1;i >= 1;i--)
			{
				if (monkey[i + 1] % (n - 1) != 0)
				{
					break;
				}
				else
				{
					monkey[i] = monkey[i + 1] * n / (n - 1) + k;
				}
			}
		}
		System.out.print(monkey[1]);
		return 0;
	}
}

