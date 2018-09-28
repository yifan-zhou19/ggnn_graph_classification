package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int out = 0;
		String input = new String(new char[123456]);
		while (scanf("%s", input) > 0)
		{
			if (out++ != 0)
			{
				System.out.print(',');
			}
			System.out.printf("%d", input.length());
		}
		return 0;
	}

}
