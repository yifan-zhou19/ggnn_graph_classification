package <missing>;

public class GlobalMembers
{
	public static int su(int input) //?????????
	{
		int ju = 1;
		for (int i = 2;i < Math.sqrt(input);i++)
		{
			if (input % i == 0)
			{
				ju = 0;
			}
			break;
		}
		return ju;
	}
	public static int fenjie(int input, int k) //k???????????input??????
	{
		int ret = 1; //re??????????????
		for (int i = k;i <= Math.sqrt(input);i++)
		{
			if (input % i == 0)
			{
				if (su(input / i) == 0)
				{
					; //????????????????????
				}
				{
					ret = fenjie(input / i, i) + ret;
			}
			}
		}
		return ret;
	}
	public static int Main()
	{
		int input;
		int num;
		int sol;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (num-- != 0) //????
		{
			input = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fenjie(input, 2));
			System.out.print("\n");
		}
		return 0;
	}

}

