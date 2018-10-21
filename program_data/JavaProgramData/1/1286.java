package <missing>;

public class GlobalMembers
{
	public static int ge; //ge???????????
	public static int s;
	public static int w;
	public static void fen(int h, int a)
	{
		for (int i = 2;i <= h;i++)
		{
			if ((h % i == 0) && (i >= a))
			{
				if (h / i != 1)
				{
					fen(h / i, i);
				}
				else
				{
					ge++;
				}
			}
		}
	}
	public static int Main()
	{
		int n = 0; //n????????   k?????????  s?????????????
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++)
		{
		   s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   ge = 0;
		   fen(s, 2);
		   System.out.print(ge);
		   System.out.print("\n");
		}
	return 0;
	}

}

