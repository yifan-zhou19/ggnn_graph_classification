package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int space = 0;
		while (true)
		{
			c = System.in.read();
			if (c == '\n')
			{
				break;
			}
			if (c == 32 && space == 0)
			{
				System.out.print(c);
				space = 1;
			}
			else if (c != 32)
			{
				System.out.print(c);
				space = 0;
			}
		}
		return 0;
	}
}
