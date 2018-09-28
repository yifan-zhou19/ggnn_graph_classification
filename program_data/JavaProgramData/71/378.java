package <missing>;

public class GlobalMembers
{
	/*
	 * fuxi008_xiangguanyue.cpp
	 * name:???
	 *  Created on: 2011-12-23
	 *      Author: zhujile
	 */
	public static int[] sday = {1, 32, 61, 92, 122, 153, 183, 214, 245, 275, 306, 336}; //??????????
	public static int[] nday = {1, 32, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335}; //????
	public static void spe() //????
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((sday[a - 1] - sday[b - 1]) % 7 == 0) //??7??
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
	}
	public static void nor() //???
	{
		int a;
		int b;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((nday[a - 1] - nday[b - 1]) % 7 == 0) //??7??
		{
			System.out.print("YES");
			System.out.print("\n");
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int n;
		int year;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) //????
			{
				spe();
			}
			else
			{
				nor();
			}
		}
		return 0;
	}

}

