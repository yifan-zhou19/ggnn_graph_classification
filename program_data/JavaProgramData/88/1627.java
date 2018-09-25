package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int flag = 0;
		c = System.in.read();
		while (c != '\n')
		{
			if (c >= '0' && c <= '9')
			{
				if (flag == 0 && c == '0')
				{
					while (c != '0')
					{
						c = System.in.read();
					}
				}
				System.out.print(c);
				flag = 1;
			}
			else if (flag)
			{
				System.out.print("\n");
				flag = 0;
			}
			c = System.in.read();
		}
		return 0;
	}
}
