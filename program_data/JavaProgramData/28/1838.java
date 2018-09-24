package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ch;
		int len = 0;
		int tag = 0;
		while ((ch = System.in.read()))
		{
			if ((ch == ' ' || ch == '\n') && len != 0)
			{
				if (tag != 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d", len);
				len = 0;
				tag = 1;
				if (ch == '\n')
				{
					break;
				}
			}
			else if (ch != ' ')
			{
				len++;
			}
		}
		System.out.print("\n");
		return 0;
	}
}
