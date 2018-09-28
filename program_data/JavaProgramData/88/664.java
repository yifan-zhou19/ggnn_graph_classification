import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ????1206.cpp
	 * ??????
	 * ?????2012-12-16
	 * ????????????
	 */



	public static int Main()
	{
		String s = new String(new char[31]); //????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		s = new Scanner(System.in).nextLine(); //????
		for (p = s; p < s + s.length(); ++p)
		{
			if (*p > 47 && *p < 58)
			{
				System.out.print(p);
			}
			else
			{
				System.out.print("\n");
				while (*(p + 1) < 48 || *(p + 1) > 57)
				{
					++p;
				}
			} //?????????????????????
		}
		return 0; //????
	}
}
