package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] in = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		in = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int[] num = new int[110];
		int[] ans = new int[110];
		int lenth = in.length();
		for (int i = 0;i < lenth;i++)
		{
			num[i] = in[i] - '0';
		}
		int r = num[0];
		for (int i = 1;i < lenth;i++)
		{
			ans[i] = (r * 10 + num[i]) / 13;
			r = (r * 10 + num[i]) % 13;
		}
		int s = 0;
		for (int i = 0;i < lenth;i++)
		{
			if (ans[i] != 0)
			{
				s = i;
				break;
			}
		}
		if (lenth <= 2 && num[1] + num[0] * 10 < 13)
		{
			System.out.print('0');
			System.out.print("\n");
			System.out.print(r);
		}
		else
		{
		for (int i = s;i < lenth;i++)
		{
			System.out.print(ans[i]);
		}
		System.out.print("\n");
		System.out.print(r);
		}

		return 0;
	}
}

