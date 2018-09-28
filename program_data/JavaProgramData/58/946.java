package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char c;
		c = System.in.read();
		int flag = 1;
		int first = 1;
		while (c = System.in.read())
		{
			if (c == '\n')
			{
				if (flag != 0)
				{
					System.out.print(1);
					System.out.print("\n");
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}
				flag = 1;
				first = 1;
				n--;
				if (n == 0)
				{
					return 0;
				}
			}
			else
			{
				if (first != 0)
				{
					flag = (c == '_' || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
					first = 0;
				}
				else
				{
					flag = flag != 0 && ((c == '_') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'));
				}
			}
		}
		return 0;
	}

}

