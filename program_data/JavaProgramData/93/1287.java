package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int a;
		int b;
		int c;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = (x % 3 == 0)? 1 : 0; //?x??3???a?1????0
		b = (x % 5 == 0)? 1 : 0; //?x??5???b?1????0
		c = (x % 7 == 0)? 1 : 0; //?x??7???c?1????0

		if (a + b + c == 3) //????357??
		{
			System.out.print(3);
			System.out.print(" ");
			System.out.print(5);
			System.out.print(" ");
			System.out.print(7);
			System.out.print("\n");
		}
		else
		{
		  if (a + b + c == 0) //?????357??
		  {
			System.out.print("n");
			System.out.print("\n");
		  }
		  else //??357?????????
		  {
			if (a + b == 0)
			{
			  System.out.print(7);
			  System.out.print("\n");
			}
			else
			{
				if (a + c == 0)
				{
				  System.out.print(5);
				  System.out.print("\n");
				}
				else
				{
					if (b + c == 0)
					{
					   System.out.print(3);
					   System.out.print("\n");
					}
					else
					{
						if (a + b == 2)
						{
						  System.out.print(3);
						  System.out.print(" ");
						  System.out.print(5);
						  System.out.print("\n");
						}
						else
						{
							if (a + c == 2)
							{
							   System.out.print(3);
							   System.out.print(" ");
							   System.out.print(7);
							   System.out.print("\n");
							}
							else
							{
								System.out.print(5);
								System.out.print(" ");
								System.out.print(7);
								System.out.print("\n");
							}
						}
					}
				}
			}
		  }
		}

		return 0;


	}

}

