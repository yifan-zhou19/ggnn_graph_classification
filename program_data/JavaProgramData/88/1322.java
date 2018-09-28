package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[32]);
		c = new Scanner(System.in).nextLine();
		int state = 0;
		for (int i = 0;i < c.length();i++)
		{
			if (* (c.Substring(i)) >= '0' && *(c.Substring(i)) <= '9')
			{
				if (state == 1)
				{
					System.out.print("\n");
					state = 0;
				}
				System.out.print((c.Substring(i)));
			}
			else
			{
				if (state == 0)
				{
					state = 1;
				}
			}
		}
	}
}
