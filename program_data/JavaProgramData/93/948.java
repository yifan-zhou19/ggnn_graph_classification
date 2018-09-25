package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t1;
		int t2;
		int t3;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 3 == 0)
		{
			t1 = 1;
		}
		else
		{
			t1 = 0;
		}
		if (n % 5 == 0)
		{
			t2 = 1;
		}
		else
		{
			t2 = 0;
		}
		if (n % 7 == 0)
		{
			t3 = 1;
		}
		else
		{
			t3 = 0;
		}
		if (t1 + t2 + t3 == 1)
		{
			if (t1 == 1)
			{
				System.out.print(3);
			}
			if (t2 == 1)
			{
				System.out.print(5);
			}
			if (t3 == 1)
			{
				System.out.print(7);
			}
		}
		else if (t1 + t2 + t3 == 2)
		{
					 if (t1 == 0)
					 {
						 System.out.print(5);
						 System.out.print(" ");
						 System.out.print(7);
					 }
					 if (t2 == 0)
					 {
						 System.out.print(3);
						 System.out.print(" ");
						 System.out.print(7);
					 }
					 if (t3 == 0)
					 {
						 System.out.print(3);
						 System.out.print(" ");
						 System.out.print(5);
					 }
		}
				else if (t1 + t2 + t3 == 3)
				{
					System.out.print(3);
					System.out.print(" ");
					System.out.print(5);
					System.out.print(" ");
					System.out.print(7);
				}
						else
						{
							System.out.print("n");
						}
		return 0;
	}


}

