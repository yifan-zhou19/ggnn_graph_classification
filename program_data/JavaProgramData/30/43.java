package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int yushu;
		int k;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			if (i % 7 == 0)
			{
				continue;
			}
			else
			{
				k = i;
			}
					while (k != 0)
					{
						yushu = k % 10;
						if (yushu == 7)
						{
						break;
						}
						else
						{
						k = (int)k / 10;
						}
					}
			if (k >= 0 && k <= 9 && yushu != 7)
			{
			s = s + i * i;
			}
			else
			{
			s = s;
			}
		}
		System.out.print(s);
	return 0;
	}

}

