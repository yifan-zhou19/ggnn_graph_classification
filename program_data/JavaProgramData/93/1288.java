package <missing>;

public class GlobalMembers
{
	//********************
	//*?5?            **
	//*???????   **
	//*2013?9?25?    **
	//********************
	public static int Main()
	{
		int num; //????num?a?b?c????3,5,7???
		int a;
		int b;
		int c;

		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		a = num % 3; //????a

		b = num % 5; //????b

		c = num % 7; //????c

		if (a != 0 && b != 0 && c != 0) //??a b c???????n
		{

			System.out.print("n");
			System.out.print("\n");
		}

		else
		{

			if (a == 0)
			{

				if (b == 0)
				{

					if (c == 0)
					{

						System.out.print("3 5 7");
						System.out.print("\n");
					}

					else
					{

						System.out.print("3 5");
						System.out.print("\n");
					}
				}

				else
				{

					if (c == 0) //??c=0 ??3 7
					{

						System.out.print("3 7");
						System.out.print("\n");
					}

					else //??b c???????3
					{

						System.out.print("3");
						System.out.print("\n");
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
						System.out.print("\n");
					}

					else
					{

						System.out.print("5");
						System.out.print("\n");
					}
				}

				else
				{

					if (c == 0) //??a?b???c??????7
					{

						System.out.print("7");
						System.out.print("\n");
					}
				}
			}
		}

		return 0; //??????????????
	}
}

