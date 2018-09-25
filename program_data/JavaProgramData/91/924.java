import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************************************
	//*  ???:4.cpp                                        *
	//*  ??????    1200012948                          *
	//*  ????: 2012 12 04                                *
	//*  ????:???????                             *
	//********************************************************
	public static int Main()
	{
		String s = new String(new char[110]);
		String s1 = new String(new char[110]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = null;
		s = new Scanner(System.in).nextLine();
		for (p = s; * p != '\0'; p++)
		{
			; //???????
		}
		p--;
		p1 = p - s + s1.Substring(1);
		*p1 = '\0';
		p1--;
		*p1 = p + *s; //??????????
		for (p--; p >= s; p--)
		{
			p1--;
			*p1 = p + *(p + 1);
		}
		for (p1 = s1; * p1 != '\0'; p1++) //??s1
		{
			System.out.print(p1);
		}
		System.out.print("\n");
		return 0;
	}

}
