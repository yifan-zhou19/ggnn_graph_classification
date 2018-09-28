package <missing>;

public class GlobalMembers
{
	/*
	 * FriendString.cpp
	 *
	 *  Created on: 2013-12-12
	 *      Author: KEVIN
	 */


	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		for (char * p = s,*p1 = s1,*pend = s.Substring(100);p <= pend;++p,++p1)
		{
			if (*(p + 1) != 0)
			{
				*p1 = p + *(p + 1);
			}
			else
			{
				*p1 = p + *s;
				*(p1 + 1) = 0;
				break;
			}
		}
		System.out.print(s1);
		return 0;
	}
}
