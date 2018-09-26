package <missing>;

public class GlobalMembers
{
	//?????????
	//??????
	//?????2010-11-23
	//?????????? n ? k??????? m


	public static int Main()
	{
		int n;
		int k;
		int apple = 1;
		int i = 1;
		int monkey = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			if (apple * n % (n - 1) != 0)
			{ //?????????????????????
				i++;
				monkey = 1;
				apple = i;
				continue;
			}
			apple = apple * n / (n - 1) + k; //??
			if (monkey == n)
			{
				System.out.print(apple);
				return 0;
			}
			monkey++;
		}
		return 0;
	}
}

