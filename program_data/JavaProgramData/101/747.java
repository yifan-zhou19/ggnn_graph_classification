package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-10-8
	 *      Author: Lixurong
	 */


	public static int get(char a, String s)
	{
		for (int i = 0; i < 3; i++)
		{
			if (s[i].equals(a))
			{
				return (2 - i);
			}
		}
	}

	public static int Main()
	{
		String[] s = {"ABC", "ACB", "BAC", "BCA", "CAB", "CBA"}; //?????
		for (int i = 0; i < 6; i++) //??
		{
			int x; //????
			int y;
			int z;
						 //??????
			x = get('A', s[i]) + (get('B', s[i]) > get('A', s[i])) + (get('A', s[i]) - get('C', s[i]) != -2 && get('A', s[i]) - get('C', s[i]) != 2);
			y = get('B', s[i]) + (get('A', s[i]) > get('B', s[i])) + (get('A', s[i]) > get('C', s[i]));
			z = get('C', s[i]) + (get('C', s[i]) > get('B', s[i])) + (get('B', s[i]) > get('A', s[i]));
			if (x == 2 && y == 2 && z == 2) //??
			{
				System.out.print(s[i]);
				return 0;
			}
		}
		return 0;
	}
}
