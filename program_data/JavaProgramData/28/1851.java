package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ch;
		int len = 0;
		while ((ch = System.in.read()) != '\n')
		{
			if (ch == ' ' && len != 0)
			{
				System.out.printf("%d", len);
				len = 0;
				break;
			}
			else if (ch != ' ')
			{
				len++;
			}
		}
		if (ch == '\n')
		{
			System.out.printf("%d\n", len);
			return 0;
		}
		while ((ch = System.in.read()) != '\n')
		{
			if (ch == ' ' && len != 0)
			{
				System.out.printf(",%d", len);
				len = 0;
			}
			else if (ch != ' ')
			{
				len++;
			}
		}
		if (len != 0)
		{
			System.out.printf(",%d\n", len);
		}
		else
		{
			System.out.print("\n");
		}
		return 0;
	}
}
