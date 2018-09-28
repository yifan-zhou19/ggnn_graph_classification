import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ????1203.cpp
	 * ??????
	 * ?????2012-12-12
	 * ???????????????
	 */



	public static int Main()
	{
		String str = new String(new char[100]); //????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		str = new Scanner(System.in).nextLine(); //????
		p = str; //?????
		for (p = str; * p != '\0'; ++p)
		{
			if (*p != ' ')
			{
				while (*p != ' ' && *p != '\0')
				{
					System.out.print(p++);
				}
				if (*p == '\0')
				{
					break; //??????????
				}
				else
				{
					System.out.print(' ');
				}
				p--; //???????
			}
		}
		return 0; //????
	}
}
