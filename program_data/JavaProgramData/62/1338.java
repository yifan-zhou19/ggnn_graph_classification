import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	 *???: filter_spaces.cpp
	 *??: ???
	 *????: 2012-12-09
	 *??: 
	 */



	public static int Main()
	{
		String input = new String(new char[MAXL]);
		String output = new String(new char[MAXL]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s; //??input,output???
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t;
		input = new Scanner(System.in).nextLine();
		for (s = input,t = output; * s; s++)
		{
			if (*s == ' ' && *(s - 1) == ' ')
			{
				continue;
			}
			*t++=*s;
		}
		*t = 0; //????\0
		System.out.print(output);
		System.out.print("\n");
		return 0;
	}


}
