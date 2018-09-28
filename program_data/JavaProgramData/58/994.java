import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * no4.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: ???
	 *      Title: ?????C????????
	 */



	public static int Main()
	{
		String str = new String(new char[82]); //??????
		int len; //?????len??????
		int i;
		int n;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cin.ignore(); //????????
		for (i = 1;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str,'\0',(Character.SIZE / Byte.SIZE)); //?????
			str = new Scanner(System.in).nextLine(); //?????
			len = str.length(); //???????
			if (str.charAt(0) != '_' && (str.charAt(0) < 65 || (str.charAt(0)>90 && str.charAt(0) < 97) || str.charAt(0)>122)) //?????????????
			{
				System.out.print(0);
				System.out.print("\n");
				continue;
			}
			for (j = 1;j < len;j++) //??????????????
			{
				if (str.charAt(j) != '_' && (str.charAt(j) < 48 || (str.charAt(j)>57 && str.charAt(j) < 65) || (str.charAt(j)>90 && str.charAt(j) < 97) || str.charAt(j)>122))
				{
					System.out.print(0);
					System.out.print("\n");
					break;
				}
			}
			if (j == len)
			{
				System.out.print(1);
				System.out.print("\n");
			}
		}
		return 0; //????
	}
}

