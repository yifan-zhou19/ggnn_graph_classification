package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int t;
		int tp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0) //?????
		{
			tp = 0;
			t = 0;
			j = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m != 0)
			{
				for (i = 1;i <= m;i++) //??60????????????
				{
					tp = t;
					t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (t + 3 * i - 3 >= 60)
					{
						t = tp;
						if (j == 0)
						{
							j = i - 1; //60?????
						}
					}
				}
			}
			else
			{
				System.out.print(60);
				System.out.print("\n");
				continue;
			}
			if (j == 0)
			{
				j = i - 1;
			}
			if (t + 3 * j - 3 <= 57)
			{
				System.out.print(60 - 3 * j);
				System.out.print("\n");
			}
			else
			{
				System.out.print(60 + t % 3 - 3 * j);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

