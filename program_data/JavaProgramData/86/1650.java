package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int w;
			int t;
			int r = -1;
			int rs = 0;
			for (int j = 0;j < c;j++)
			{
				w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				t = w + j * 3;
				if (t <= 60 && t + 3 >= 60)
				{
					r = w;
				}
				else if (t < 60)
				{
					rs++;
				}
			}
			if (r != -1)
			{
				System.out.print(r);
				System.out.print("\n");
			}
			else
			{
				System.out.print(60 - rs * 3);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

