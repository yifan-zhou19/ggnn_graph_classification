package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int x;
	  int y;
	  x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

	  int tree = new int(int,int);
	  System.out.print(tree(x, y));

	}

	public static int tree(int x,int y)
	{
		while (x != y)

		{
			  if (x > y)
			  {
				  x = x / 2;
			  }
			  else
			  {
				  y = y / 2;
			  }
		}

		return x;

	}
}

