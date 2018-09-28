package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int flag = 0;
		for (;;)
		{
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
			if (c != ' ')
			{
				System.out.print(c);
				flag = 0;
			}
			else
			{
				if (flag != 0)
				{
					continue;
				}
				else
				{
					flag = 1;
					System.out.print(c);
				}
			}
		}

		return 0;
	}
}
