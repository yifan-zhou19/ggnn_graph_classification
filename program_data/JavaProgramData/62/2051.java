import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************************************************
	//*  ?????1.cpp                                       *
	//*  ??????1200012906                                *
	//*  ???2012?12?3?                                   *
	//*  ????????????                              *
	//**********************************************************

	public static int Main()
	{
		int flag = 0;
		String str = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		str = new Scanner(System.in).nextLine();
		for (p = str; * p != '\0'; p++) //????
		{
			if (*p == ' ') //?????
			{
				if (flag == 1) //??????????????
				{
					continue;
				}
				else //????????????
				{
					System.out.print(p);
					flag = 1;
				}
			}
			else //???????????????????
			{
				System.out.print(p);
				flag = 0;
			}
		}
		System.out.print("\n");
		return 0;
	}
}
