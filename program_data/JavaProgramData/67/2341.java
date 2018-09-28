package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
		int n; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a; //????
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double x = (0.01 * b) / (0.01 * a); //???????
		for (int i = 0 ; i < (n - 1); i++) //????
		{
			int c; //????
			int d;
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double y = (0.01 * d) / (0.01 * c); //???????
			if (x - y > 0.05) //????
			{
				System.out.print("worse");
				System.out.print('\n');
			}
			else if (y - x > 0.05) //????
			{
				System.out.print("better");
				System.out.print('\n');
			}
			else
			{
				System.out.print("same");
				System.out.print('\n');
			}
		}


		return 0; //???????????????????



	}


}

