package <missing>;

public class GlobalMembers
{
	/*
	 * ?????.cpp
	 *
	 *  Created on: 2011-11-23
	 *      Author: ???
	 */

	public static int m; //??????
	public static int n;
	public static int k = 0;
	public static int emptyOverone(int apple, int plate)
	{ //???????????????
		if (plate == 1)
		{
			return 0; //??
		}
		/*?(apple<plate)????*/
		return AllFull(apple, plate-1) + emptyOverone(apple, plate-1);
	}
	public static int AllFull(int apple,int plate)
	{ //??????????????
		if (apple < plate)
		{
			return 0; //????
		}
		if (plate == apple)
		{
			return 1;
		}
		/*?(apple>plate)????*/
		return AllFull(apple - plate, plate) + emptyOverone(apple - plate, plate);
	}

	public static int Main()
	{ //???
		int zushu = 0;
		zushu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int shuchu = 0;
		while (zushu > 0)
		{ //???????
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			shuchu += emptyOverone(m, n) + AllFull(m, n); //??????
			System.out.print(shuchu);
			System.out.print("\n");
			zushu--;
		shuchu = 0;
		}
		return 0;
	}


}

