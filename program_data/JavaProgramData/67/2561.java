package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //?????n???????all,?????cure
		int all;
		int cure;
		double x; //??????????? x,???????y
		double y;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		all = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cure = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		x = (double)cure / all * 100; //??????????

		for (int i = 0; i < n - 1; i++)
		{
			all = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			cure = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			y = (double)cure / all * 100; //????????

			if (y - x > 5) //??y-x??5????better
			{
				 System.out.print("better");
				 System.out.print("\n");
			}
			else
			{
				if (x - y > 5) //??x-y??5????worse
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

