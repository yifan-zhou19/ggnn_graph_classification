import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012746_30_3.cpp
	 *
	 *  Created on: 2010-11-6
	 *      Author: dyj
	 *      Description:???????????????????<=100??
	 *                  ???????????????????????????????????
	 *                  ????????????????????????????????
	 *
	 */

	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		String d = new String(new char[10001]);
		a = new Scanner(System.in).nextLine();
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int la = a.length();
		int lb = b.length();
		int lc = c.length();
		int i;
		int j = 0;
		int k;
		int num;
		for (i = 0;i < la;i++)
		{ //???????????????lb???????
			for (k = 0,num = 0;k < lb;k++)
			{
				if (a.charAt(i) == b.charAt(k))
				{
					num++;
				}
				i++;
			} //?num?????????
		   if (((num == lb) && (a.charAt(i - k - 1) == ' ')) || ((num == lb) && (i == k)))
		   { //??????????????
			   i = i - 1;
			   for (k = 0;k < lc;k++)
			   {
				   d = tangible.StringFunctions.changeCharacter(d, j, c.charAt(k));
				   j++;
			   } //????c??
		   }
		   else
		   {
			   i = i - k;
			   d = tangible.StringFunctions.changeCharacter(d, j, a.charAt(i));
			   j++;
		   } //??????a
		   d = tangible.StringFunctions.changeCharacter(d, j, '\0');
		}
		System.out.print(d);
		System.out.print("\n");
		return 0; //????
	}

}

