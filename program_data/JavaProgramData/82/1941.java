package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //?n??????shou?????shu????
		int shou;
		int shu;
		int x;
		int t = 0;
		int y = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			shou = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			shu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((shou >= 90) && (shou <= 140) && (shu >= 60) && (shu <= 90)) //??????90-140???????60-90?????
			{
				t = t + 1;
			}
			if ((shou < 90) || (shou > 140) || (shu < 60) || (shu > 90))
			{
				x = t; //?????????????????
				t = 0; //?t????x,??t???0
				if (x > y)
				{
				y = x; //??x??y,??x???y
				}
			}
		}
		if (t > y)
		{
			System.out.print(t);
			System.out.print("\n");
		}
		else
		{
			System.out.print(y);
			System.out.print("\n");
		}
	return 0;
	}
}

