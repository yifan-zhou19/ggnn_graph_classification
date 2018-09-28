package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		char d;
		while ((c = System.in.read()) != '\n')
		{
			if (c != ' ' || d != ' ')
			{
				System.out.print(c);
			}
			d = c;
		}
		System.out.print("\n");
		return 0;
	}
}
