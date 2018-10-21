package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		c = System.in.read();
		while (c != '\n')
		{
			if (c == ' ')
			{
				System.out.print(" ");
				while (c == ' ')
				{
					c = System.in.read();
				}
			}
			System.out.print(c);
			c = System.in.read();
		}
		return 0;
	}
}
