import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 7.cpp
	 * ????
	 *  Created on: 2012-11-5
	 *      Author: Salforever
	 */



	public static int Main()
	{
		int length; //????
		int num;
		int i;
		int len = 0;
		String x = new String(new char[105]);
		char[][] y = new char[101][105];
		x = new Scanner(System.in).nextLine(); //?????
		length = x.length(); //???????
		num = 1; //???????
		for (i = 0;i <= length - 1;i++) //????
		{
			if (x.charAt(i) != ' ')
			{
			y[num][len] = x.charAt(i);
			len++;
			}
			else
			{
				y[num][len] = '\0';
				num++;
				len = 0;
			}
		}
		for (i = num;i >= 2;i--) //????
		{
			System.out.print(y[i]);
			System.out.print(' ');
		}
		System.out.print(y[1]);
		System.out.print("\n");
		return 0;
	}

}
