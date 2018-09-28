package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //n?????
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = 0;
		if (n % 3 == 0)
		{
			m = 1;
			System.out.print(3);
			if (n % 5 == 0)
			{
				System.out.print(" ");
				System.out.print(5);
			}
			else
			{
				;
			}
			if (n % 7 == 0)
			{
				System.out.print(" ");
				System.out.print(7);
			}
			else
			{
				;
			}
		}
		else
		{
			if (n % 5 == 0)
			{
				m = 1;
				System.out.print(5);
			if (n % 7 == 0)
			{
				System.out.print(" ");
				System.out.print(7);
			}
			else
			{
				;
			}
			}
			else
			{

				if (n % 7 == 0)
				{
					System.out.print(7);
					m = 1;
				}
				else
				{
					;
				}
			}
		}
		if (m == 0)
		{
			System.out.print("n");
		}
		else
		{
			;
		}
		return 0;
	}
}

