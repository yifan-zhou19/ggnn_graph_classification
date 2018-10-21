package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char d;
		while ((d = System.in.read()) != EOF)
		{
			System.out.printf("%c",d);
			if (d == ' ')
			{
				for (;;)
				{
					if ((d = System.in.read()) == ' ')
					{
						continue;
					}
					else
					{
						System.out.printf("%c",d);
						break;
					}
				}
			}
		}
		return 0;
	}
}
