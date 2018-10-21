package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		int num = 0;

		c = System.in.read();

		while (c != '\n')
		{
			if (c >= '0' && c <= '9')
			{
				num = 1;
				System.out.printf("%c",c);
			}
			else
			{
				if (num == 1)
				{
					System.out.print('\n');
					num = 0;
				}
			}
			c = System.in.read();
		}
	}
}
