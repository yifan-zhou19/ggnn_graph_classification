import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * huiwen string.cpp
	 *??:???????????
	 *  Created on: 2012-12-19
	 *      Author: ???
	 */



	public static int Main()
	{
		String word = new String(new char[501]); //?????????
		word = new Scanner(System.in).nextLine(); //?????
		int slen = word.length(); //???????
		int len = 2; //??????,??????,??,????????????,
		int pos = 0;
		int num1;
		int num2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null; //???????p,q
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		for (len = 2;len <= slen;len++) //??????
		{
			if (num1 == 0 && num2 == 0) //??????????(????)?????,????
			{
				break;
			}
			if (len % 2 == 0) //??????????
			{
				num2 = 0;
			}
			else //?????
			{
				num1 = 0;
			}
			for (pos = 0;pos <= slen - len;pos++) //????
			{
				p = word.Substring(pos);
				q = word.Substring(pos) + len - 1;
				do
				{
					if (*q != *p) //?????
					{
						break;
					}
					else
					{
						p++;
						q--;
					}
				}while (q > p);
				if (q <= p)
				{
					for (i = 0;i < len;i++)
					{
					System.out.print(word.charAt(pos + i));
					}
					System.out.print("\n");
					if (len % 2 == 0) //??
					{
						num2++;
					}
					else
					{
						num1++;
					}
				}
			}
		}
		return 0;
	}
}
