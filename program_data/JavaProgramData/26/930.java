import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	 * 2.cpp
	 * ?? ??
	 * ?? 2011 11 29
	 * ???????
	 */
	public static int Main()
	{
		String str = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		str = new Scanner(System.in).nextLine();
		p = str;


		while (*p != '\0')

		{
			while ((*p != ' ') && (*p != '\0'))
			{
				System.out.print(p);
				p++;
			}

			if (*p == '\0') // ???? ???????? ?????????p++???????????�\0�)
			{
				break;
			}

			while ((*p == ' ') && (*p != '\0'))
			{
				p++;
			}

			if (*p == '\0') // ???? ???????? ?????????p++???????????�\0�)
			{
				break;
			}
			else
			{
				System.out.print(' ');
			}
		}
		return 0;
	}

	 //~                                                                                                  1.
	//????????100?? ?????









}
