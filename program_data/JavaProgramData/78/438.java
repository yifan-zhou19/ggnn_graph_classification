package <missing>;

public class GlobalMembers
{
	public static int[] w = new int[4];
	public static String c = new String(new char[4]);
	public static void work(int p)
	{
		if (p == 4)
		{
			if ((w[0] + w[1] == w[2] + w[3]) && (w[0] + w[3] > w[1] + w[2]) && (w[0] + w[2] < w[1]))
			{
			for (int i = 50; i >= 10; i--)
			{
				for (int j = 0; j < 4; j++)
				{
					if (w[j] == i)
					{
						System.out.print(c.charAt(j));
						System.out.print(' ');
						System.out.print(i);
						System.out.print("\n");
					}
				}
			}
			}
			return;
		}
		for (int i = 10; i <= 50; i += 10)
		{
			w[p] = i;
			work(p + 1);
		}
	}
	public static int Main()
	{
		c = tangible.StringFunctions.changeCharacter(c, 0, 'z');
		c = tangible.StringFunctions.changeCharacter(c, 1, 'q');
		c = tangible.StringFunctions.changeCharacter(c, 2, 's');
		c = tangible.StringFunctions.changeCharacter(c, 3, 'l');
		work(0);
		return 0;
	}

}

