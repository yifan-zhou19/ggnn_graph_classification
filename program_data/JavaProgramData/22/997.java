package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int sec;
		int s;
		int t;
		int i;
		int j;
		int k;
		int l;
		char c;
		max = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = System.in.read();
		if (c == '\n')
		{
			System.out.print("No");
			System.out.print("\n");
		}
		else
		{
			sec = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = System.in.read();
			if (max < sec)
			{
				t = max;
				max = sec;
				sec = t;
			}
			if (c == '\n')
			{
				if (sec < max)
				{
					System.out.print(sec);
					System.out.print("\n");
				}
				else
				{
					System.out.print("No");
					System.out.print("\n");
				}
			}
			else
			{
				for (;;)
				{
					s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					c = System.in.read();
					if (s > max)
					{
						sec = max;
						max = s;
					}

					else if (s > sec && s != max)
					{
						sec = s;
					}
					else if (s < sec && sec == max)
					{
						sec = s;
					}
					if (c == '\n')
					{
						if (sec == max)
						{
							System.out.print("No");
							System.out.print("\n");
						}
						else
						{
							System.out.print(sec);
							System.out.print("\n");
						}
						break;
					}
				}
			}
		}
		return 0;
	}
}

