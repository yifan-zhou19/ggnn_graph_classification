import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*****************************
	//*@file:1.cpp                *
	//*@author:??? 1200012894  *
	//*@date:2012.11.30           *
	//*@function:???????   *
	//*****************************

	public static int Main()
	{
		String str = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		str = new Scanner(System.in).nextLine();
		p = str; // ?str??????p
		while (*p != '\0')
		{
			if (*p == ' ')
			{
				if (*(p + 1) == ' ')
				{
					q = p; // p + 1????q,???????
					while (*q != '\0')
					{
						*q = (q + 1);
						q++;
					}
				}
				else
				{
					p++;
				}
			}
			else
			{
				p++;
			}
		}
		System.out.print(str);
		return 0;
	}



}
