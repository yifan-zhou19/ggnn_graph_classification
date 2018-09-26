package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char c;
		int n = 0;
		while ((c = System.in.read()) != '\n')
		{
			if (c == ' ')
			{
				if (n == 0) //?n????????
				{
					System.out.print(' ');
					n++;
				}
				else
				{
					n++;
				}
			}
			else
			{
				System.out.print(c);
				n = 0;
			}
		}
			return 0;
	}
}
