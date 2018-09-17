package <missing>;

public class GlobalMembers
{
	/*
	 * 009.cpp
	 *
	 *  Created on: 2012-11-27
	 *      Author: asus
	 */
	public static int varieties = 0; //??????


	public static void divide(int forward, int number) //??divide??
	{
	 int i;
	 if (number == 1) //????
	 {
	  varieties++; //??
	 }
	 for (i = forward; i <= number; i++) //forward???????,number?????,?forward?????
	 {
	  if (number % i == 0) //????
	  {
		divide(i, number / i);
	  }
	 }
	}

	public static int Main() //???
	{
		int n = 0;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
				num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		divide(2, num); //??
		System.out.print(varieties);
		System.out.print("\n");
			varieties = 0;
		}
		return 0;
	}
}

