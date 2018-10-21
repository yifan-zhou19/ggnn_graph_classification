package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int x2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x1 == x2)
		{
			System.out.print(x1);
			System.out.print("\n");
		}
		else
		{

	  while (x1 >= 2 * x2 || x2 >= 2 * x1)
	  {
		  if (x1 >= 2 * x2)
		  {
				x1 = x1 / 2;
		  }
			if (x2 >= 2 * x1)
			{
				x2 = x2 / 2;
			}
	  }
	  while (x1 != x2)
	  {
		  x1 = x1 / 2;
		  x2 = x2 / 2;

	  while (x1 >= 2 * x2 || x2 >= 2 * x1)
	  {
		  if (x1 >= 2 * x2)
		  {
				x1 = x1 / 2;
		  }
			if (x2 >= 2 * x1)
			{
				x2 = x2 / 2;
			}
	  }
	  }
	  System.out.print(x1);
	  System.out.print("\n");
		}
		return 0;
	}
}

