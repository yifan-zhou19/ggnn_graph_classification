package <missing>;

public class GlobalMembers
{
	// * * * * * * * * * * * * * * *
	// *????????           *
	// *??????  1300013011   *
	// *???2013.9.30            *
	// * * * * * * * * * * * * * * *


	public static int Main()
	{
		int n;
		int a1;
		int a2;
		int b1;
		int b2;

		double x;
		double y;
		double m;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		a1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		x = a2;

		x = x / a1;

		for (int i = 2; i <= n; i++)

		{
			b1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			y = b2;

			y = y / b1;

			m = x - y;

			if (m < -0.05)
			{

				System.out.print("better");
				System.out.print("\n");
			}

			else
			{

				if (m > 0.05)
				{

					System.out.print("worse");
					System.out.print("\n");
				}

				else
				{

					System.out.print("same");
					System.out.print("\n");
				}
			}
		}

		return 0;
	}
}

