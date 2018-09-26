import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 * ????pick-out-numbers.cpp
	 * ??????
	 * ????:2012-12-19
	 * ???????
	 */
	public static int Main()
	{ //???
		String str = new String(new char[31]); //?????str,??p
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		str = new Scanner(System.in).nextLine(); //?????str
		if (Character.isDigit(*p))
		{
			System.out.print(p++);
		}
		while (*p != 0) //????????
		{
			if (Character.isDigit(*p))
			{
				System.out.print(p);
			}
			else if (Character.isDigit(*p) != Character.isDigit(*(p - 1)))
			{
				System.out.print('\r');
			}
			p++;
		}
		return 0; //?????
	}
}
