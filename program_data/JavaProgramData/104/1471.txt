package <missing>;

public class GlobalMembers
{
	/*
	 * Homework7.6BinaryTree.cpp
	 *
	 *  Created on: 2013-11-22
	 *      Author: JuiceHe
	 */
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int find = new int(int,int);
		System.out.print(find(x, y));
		System.out.print("\n");
	}
	public static int find(int x,int y)
	{
		if (x == y)
		{
			return x; //??????????????
		}
		if (x > y)
		{
			return (find(x / 2, y)); //??????????????????????
		}
		else
		{
			return (find(x, y / 2));
		}
	}

}

