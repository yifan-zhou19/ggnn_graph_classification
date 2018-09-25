package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int x;
	int y;
	x = 0,y = 0;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n % 5 == 0)
	{
	  x = 1;
	}
	if (n % 7 == 0)
	{
	  y = 1;
	}
	if (n % 3 == 0)
	{
			if (x == 1 || y == 1) //??????????x,y?????????????
			{
			System.out.print(3);
			System.out.print(" ");
			}
		else
		{
			System.out.print(3);
		}
	}
	if (n % 5 == 0)
	{
			if (y == 1)
			{
			System.out.print(5);
			System.out.print(" ");
			}
		else
		{
			System.out.print(5);
		}
	}
	if (n % 7 == 0) //??????????????
	{
	  System.out.print(7);
	}
	if (n % 7 != 0 && n % 3 != 0 && n % 5 != 0)
	{
	  System.out.print('n');
	}

	return 0;
	}






}

