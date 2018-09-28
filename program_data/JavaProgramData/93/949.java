package <missing>;

public class GlobalMembers
{
	/*************************************************************************************************************
	* @file .cpp
	* @author ????
	* @date 
	* @description
	*         
	*/


	public static int Main()
	{
		int a;
		int k = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 3 == 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.print("3 5 7");
			k += 1;
		}
		if (a % 3 != 0 && a % 5 == 0 && a % 7 == 0)
		{
			System.out.print("5 7");
			k += 1;
		}
		if (a % 3 == 0 && a % 5 != 0 && a % 7 == 0)
		{
			System.out.print("3 7");
			k += 1;
		}
		if (a % 3 == 0 && a % 5 == 0 && a % 7 != 0)
		{
			System.out.print("3 5");
			k += 1;
		}
		if (a % 3 != 0 && a % 5 != 0 && a % 7 == 0)
		{
			System.out.print("7");
			k += 1;
		}
		if (a % 3 == 0 && a % 5 != 0 && a % 7 != 0)
		{
			System.out.print("3");
			k += 1;
		}
		if (a % 3 != 0 && a % 5 == 0 && a % 7 != 0)
		{
			System.out.print("5");
			k += 1;
		}
		if (k == 0)
		{
			System.out.print("n");
		}
	return 0;
	}
}

