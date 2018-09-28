import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************************
	//*  ? ? ?: homework.cpp                          *
	//*  ?    ?: ???                                *
	//*  ????: 2012?12?2?                         *
	//*  ????: ???????                        *
	//****************************************************


	public static int Main()
	{
		String st1 = new String(new char[102]);
		String st2 = new String(new char[102]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		p = st1;
		q = st2;
		st1 = new Scanner(System.in).nextLine(); //??
		while (*(p + 1) != '\0')
		{
			*(q++) = *p + *(++p); //??
		}
		*(q++) = *p + *st1; //????????
		*q = '\0'; //??????\0
		System.out.print(st2);
		System.out.print("\n");

	}

}
