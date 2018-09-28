package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int[] b = new int[30];
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0)
			{
				c = 60;
			}
			else
			{
				for (int j = 0;j < a;j++)
				{
					b[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (b[j] + 3 * j < 58)
					{
						c = 60 - 3 * a;
					}
					else if (b[j] + 3 * j > 57 && b[j] + 3 * j < 61)
					{
						c = b[j];

					}
					else if (b[j] + 3 * j > 60 && b[j - 1] + 3 * j - 3 < 58)
					{
						c = 60 - 3 * j;

					}
				}
			}
			System.out.print(c);
			System.out.print("\n");
		}
		return 0;
	}
}

