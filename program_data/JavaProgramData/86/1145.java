package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 0)
		{
			n--;
			int x;
			int i;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x == 0)
			{
				System.out.print(60);
				System.out.print("\n");
				continue;
			}
			int[] s = new int[x];
			for (i = 0;i < x;i++)
			{
				s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (s[x - 1] + 3 * x <= 60)
			{
				System.out.print(60 - 3 * x);
				System.out.print("\n");
				continue;
			}
			else if (s[x - 1] + 3 * x > 60 && s[x - 1] + 3 * x - 3 <= 60)
			{
				System.out.print(s[x - 1]);
				System.out.print("\n");
				continue;
			}
			else
			{
			for (i = 0;i < x;i++)
			{
				if (s[i] + 3 * i + 3 > 60)
				{
					if (s[i] + 3 * i <= 60)
					{
						System.out.print(s[i]);
						System.out.print("\n");
						break;
					}
					else
					{
						System.out.print(60 - 3 * i);
						System.out.print("\n");
						break;
					}
				}
			}
			}
		}
		return 0;
	}

}

