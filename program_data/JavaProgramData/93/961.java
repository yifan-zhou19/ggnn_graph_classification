package <missing>;

public class GlobalMembers
{
	//********************************
	//*??3,5,7????   **
	//*?????? 1200012784 **
	//*???2012.9.28  **
	//********************************

	public static int Main()
	{
		int num; //??????num??????
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (num % 3 == 0) //??3????num
		{
			System.out.print(3);
			if (!(num % 5) || !(num % 7))
			{
				System.out.print(' ');
			}
		}
		if (num % 5 == 0) //??5????num
		{
			System.out.print(5);
			if ((num % 7) == 0)
			{
				System.out.print(' ');
			}
		}
		if (num % 7 == 0)
		{
			System.out.print(7);
		}
		if (num % 3 && num % 5 && num % 7)
		{
			System.out.print('n');
		}

		return 0;
	}
}

