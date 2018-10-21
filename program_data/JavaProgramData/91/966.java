import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************************************************
	//*  ?????4.cpp                                       *
	//*  ??????1200012906                                *
	//*  ???2012?12?3?                                   *
	//*  ????????????                              *
	//**********************************************************

	public static int Main()
	{
		String str = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char t;
		str = new Scanner(System.in).nextLine();
		p = str;
		t = p; //????????
		for (; p < str + str.length() - 1; p++)
		{
			*p = p + *(p + 1);
			System.out.print(p);
		}
		t = p + t;
		System.out.print(t);
		System.out.print("\n");
		return 0;
	}
}
