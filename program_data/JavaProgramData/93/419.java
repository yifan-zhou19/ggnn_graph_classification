package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //??a?????
		int b = 3;
		int c = 5;
		int d = 7;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % b == 0)
		{
			if (a % c == 0)
			{
				if (a % d == 0)
				{
				System.out.print(b);
				System.out.print(" ");
				System.out.print(c);
				System.out.print(" ");
				System.out.print(d);
				}
				else
				{
					System.out.print(b);
					System.out.print(" ");
					System.out.print(c);
				}
			}
			else if (a % d == 0)
			{
				System.out.print(b);
				System.out.print(" ");
				System.out.print(d);
			}
				 else
				 {
					 System.out.print(b);
				 }
		}
		else
		{
			 if (a % c == 0)
			 {
				if (a % d == 0)
				{
				System.out.print(c);
				System.out.print(" ");
				System.out.print(d);
				}
				else
				{
					System.out.print(c);
				}
			 }
			else if (a % d == 0)
			{
				System.out.print(d);
			}
				 else
				 {
					 System.out.print("n");
				 }
		}
		return 0;
	}

}

