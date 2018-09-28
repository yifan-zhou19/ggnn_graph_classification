import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ReverseOfWords.cpp
	 *
	 *  Created on: 2012-11-10
	 *      Author: Cui Zhaoxiong Class4 1200012931
	 */
	public static int Main()
	{
		String ipt = new String(new char[110]); //??????????
		ipt = new Scanner(System.in).nextLine(); //??
		char[][] w = new char[100][50]; //?????????????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(w,0,(Character.SIZE / Byte.SIZE)); //??
		int stofwd = 0; //stofwd????????????????nbofwd??????
		int nbofwd = 0;
		for (int i = 0;ipt.charAt(i) != 0;i++)
		{ //????????w
			if (ipt.charAt(i) != ' ')
			{
				w[nbofwd][i - stofwd] = ipt.charAt(i);
			}
			if (ipt.charAt(i) == ' ')
			{
				nbofwd++;
				stofwd = i + 1;
			}
		}
		for (int j = 0;w[nbofwd][j] != 0;j++)
		{
			System.out.print(w[nbofwd][j]);
		}
		for (int i = 1;i <= nbofwd;i++)
		{ //????????
			System.out.print(' ');
			for (int j = 0;w[nbofwd - i][j] != 0;j++)
			{
				System.out.print(w[nbofwd - i][j]);
			}
		}
		return 0;
	}

}
