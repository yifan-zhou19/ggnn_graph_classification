package <missing>;

public class GlobalMembers
{
	public static double Rate(int tot,int eff) //???????Rate?????????effective?????total?????????????????????double Rate
	{
		double rate;
		rate = (double)eff / (double)tot; //????eff?tot?int??????????????????????eff?tot???int????????????????????
		return (rate);
	}
	public static int Main()
	{
		int n;
		int i;
		int tot;
		int eff;
		double rate;
		double rate0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		tot = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eff = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		rate0 = Rate(tot, eff);
		for (i = 1;i < n;i++)
		{
			tot = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			eff = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			rate = Rate(tot, eff);
			if (rate > rate0 + 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (rate < rate0 - 0.05)
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

