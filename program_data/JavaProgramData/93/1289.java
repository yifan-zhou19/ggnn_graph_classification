package <missing>;

public class GlobalMembers
{
	//****************************
	//*???:5.cpp               *
	//*??:??                  *
	//*????:2013?10?3?     *
	//*????:??3,5,7????  *
	//****************************
	public static int Main() //???
	{
		int n;
		int a;
		int b;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = n % 3;
		b = n % 5;
		c = n % 7;
		if (a == 0)
		{
			if (b == 0)
			{
				if (c == 0)
				{
					System.out.print("3 5 7");
				}
				else
				{
					System.out.print("3 5");
				}
			}
			else
			{
				if (c == 0)
				{
					System.out.print("3 7");
				}
				else
				{
					System.out.print("3");
				}
			}
		}
		else
		{
			if (b == 0)
			{
				if (c == 0)
				{
					System.out.print("5 7");
				}
				else
				{
					System.out.print("5");
				}
			}
			else
			{
				if (c == 0)
				{
					System.out.print("7");
				}
				else
				{
					System.out.print("n");
				}
			}
		}
		return 0;
	}

}

