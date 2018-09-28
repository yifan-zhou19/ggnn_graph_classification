package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int state = 0;
		while ((c = System.in.read()) != EOF)
		{
		switch (state)
		{
		case 0:
			if (Character.isDigit(c))
			{
				System.out.print(c);
				state = 1;
			}
			break;
		case 1:
			if (!Character.isDigit(c))
			{
				System.out.print('\n');
				state = 0;
			}
			else
			{
				System.out.print(c);
			}
			break;
		}
		}
		return 0;
	}
}
