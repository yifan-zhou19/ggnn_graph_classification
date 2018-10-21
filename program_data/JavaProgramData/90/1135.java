package <missing>;

public class GlobalMembers
{
	/*
	 * ParallelResistance.cpp
	 *
	 *  Created on: 2011-9-21
	 *      Author: 1100012959
	 */

	public static int sol(int apple,int plate) //?????????
	{
		int solution; //???????
		if (plate == 1 || apple == 0) //??????????1?????0
		{
			solution = 1; //??????
		}
		else if (apple >= plate) //???????????
		{
			solution = sol(apple - plate, plate) + sol(apple, plate-1); //????????????????????
		}
		else if (apple < plate)
		{
			solution = sol(apple, plate-1); //?????????????????
		}
		return solution;
	}
	public static int Main()
	{
		int n;
		int apple;
		int plate;
		int solution;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;n > 0;n--) //????
		{
			apple = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			plate = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			solution = sol(apple, plate);
			System.out.print(solution);
			System.out.print("\n");
		}
		return 0;
	}
}

