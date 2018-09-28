package <missing>;

public class GlobalMembers
{
	// ??13
	// ??? 1100012820
	// 20111102
	//******************
	public static int Main()
	{
		final String num = "";
		int[] ans = new int[100];
		num = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int i;
		int j = 0;
		int yushu = num.charAt(0) - '0';
		for (i = 1; i < num.length(); i++)
		{
			if ((yushu * 10 + (num.charAt(i) - '0')) > 12)
			{
				ans[i - 1] = (yushu * 10 + (num.charAt(i) - '0')) / 13;
				yushu = (yushu * 10 + (num.charAt(i) - '0')) % 13;
			}
			else
			{
				ans[i - 1] = 0;
				yushu = (yushu * 10 + (num.charAt(i) - '0'));
			}
			j++;
		}
		if ((ans[0] == 0) && (j <= 1))
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
			if (ans[0] == 0)
			{
				i = 1;
			}
			else
			{
				i = 0;
			}
			for (; i < j; i++)
			{
				System.out.print(ans[i]);
			}
			System.out.print("\n");
		}
		System.out.print(yushu);
		System.out.print("\n");
		return 0;
	}
}

