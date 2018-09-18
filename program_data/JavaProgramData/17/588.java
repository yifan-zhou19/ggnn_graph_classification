import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * 3704:??????
	 *
	 *  Created on: 2012-12-1
	 *      Author: zhuyongfu
	 */


	public static String s = new String(new char[101]); //?????????????
	public static int l; //??????
	public static int f(int k)
	{ //????
		int i;
		int j;
		for (i = k;i >= 0;i--) //??????
		{
			if (s.charAt(i) == '(')
			{
				for (j = i + 1;j < l;j++)
				{
					if (s.charAt(j) == ')') //????????????
					{
							s = tangible.StringFunctions.changeCharacter(s, i, 'a'); //?????????
							s = tangible.StringFunctions.changeCharacter(s, j, 'a');
							k = i;
							return f(k); //??
					}
				}
			}
		}
		for (i = 0;i < l;i++) //??
		{
			if (s.charAt(i) == '(')
			{
				System.out.print('$');
			}
			else if (s.charAt(i) == ')')
			{
				System.out.print('?');
			}
			else
			{
				System.out.print(' ');
			}
		}
		System.out.print("\n");
		return 0;
	}

	public static int Main()
	{
		while (s = new Scanner(System.in).nextLine())
		{ //??
			l = s.length();
			System.out.print(s);
			System.out.print("\n");
			f(l - 1); //????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(s,'\0',(Character.SIZE / Byte.SIZE)); //??
		}
		return 0;
	}
}

