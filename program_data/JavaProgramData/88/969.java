package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String buf = new String(new char[32]);
		buf = new Scanner(System.in).nextLine();
		int offset = 0;
		char c;
		while (offset < buf.length())
		{
			c = (buf.Substring(offset));
			if ('0' <= c && c <= '9')
			{
				System.out.print(c);
			}
			else
			{
				System.out.print("\n");
			}
			++offset;
		}
		return 0;
	}
}
