package <missing>;

public class GlobalMembers
{
	/*
	 * qzlx9.cpp
	 *
	 *  Created on: 2010-11-17
	 *      Author: hanzhe
	 */


	public static int Main()
	{ //????
		int[] a = new int[16];
		int j;
		while ((a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{ //???????
			if (a[0] == -1)
			{
				break; //???-1???
			}
			int i = 1;
			int l = 0;
			while ((a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				if (a[i] == 0)
				{
					break; //??????0?????
				}
				for (j = 0;j < i;j++) //??
				{
					if ((a[i] == 2 * a[j]) || (a[j] == 2 * a[i]))
					{
						l = l + 1;
					}
				}
				i++;
			}
			System.out.print(l);
			System.out.print("\n");
		}
		return 0;
	} //????

}

