package <missing>;

public class GlobalMembers
{
	//*******************************
	//*project : 5.cpp**
	//*author : ??? 1200012971**
	//*time : 2012.10.4**
	//*******************************
	public static int Main() //?????
	{
		int a; //???????
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0) //a??3?5?7???????
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		else
		{
			if (a % 15 == 0 || a % 35 == 0 || a % 21 == 0)
			{
				if (a % 3 == 0 && a % 5 == 0) // ??a????3 5 7 ???????
				{
					System.out.print("3 5");
					System.out.print("\n");
				}
				if (a % 5 == 0 && a % 7 == 0)
				{
					System.out.print("5 7");
					System.out.print("\n");
				}
				  if (a % 3 == 0 && a % 7 == 0)
				  {
					System.out.print("3 7");
					System.out.print("\n");
				  }
			}
			else
			{
				if (a % 3 == 0) //??a???3 5 7???????
				{
					System.out.print("3");
					System.out.print("\n");
				}
				if (a % 5 == 0)
				{
					System.out.print("5");
					System.out.print("\n");
				}
				if (a % 7 == 0)
				{
					System.out.print("7");
					System.out.print("\n");
				}
				if (a % 3 != 0 && a % 5 != 0 && a % 7 != 0)
				{
					System.out.print("n");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

