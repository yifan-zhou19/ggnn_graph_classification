package <missing>;

public class GlobalMembers
{
	/*
	 * pickup.cpp
	 *   Author: ???
	 *  Created on: 2012-12-13
	 *  ???  ?????????
	 *
	 */
	public static int Main()
	{
		String a = new String(new char[32]); //???????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		int n = 0; //????
		int i;
		a = new Scanner(System.in).nextLine();
		p = a;
		for (; * p != '\0';p++)
		{ //????????
			if (Character.isDigit(*p) && *(p + 1) != '\0') //??????????????????????
			{
				n++; //??
			}
			else
			{ //??
				for (i = n - 1;i >= 0;i--) //????
				{
					System.out.print((p - i - 1));
				}
				if (*(p + 1) == '\0' && Character.isDigit(*p)) //???????????????
				{
					System.out.print((p));
				}
				if (n != 0)
				{
					System.out.print("\n");
				}
				n = 0; //??
			}
		}
		return 0;
	}

}
