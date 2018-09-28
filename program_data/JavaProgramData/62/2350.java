package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int f = 1;
		while ((c = System.in.read()) != EOF)
		{
			if (c != ' ')
			{
				System.out.print(c);
				f = 1;
			} //deal with words

			else if (f)
			{
				System.out.print(c);
				f = 0;
			} //deal with space
		}
		return 0;
	}
}
