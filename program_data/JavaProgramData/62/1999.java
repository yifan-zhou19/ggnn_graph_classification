import java.util.*;

package <missing>;

public class GlobalMembers
{
	//************************
	//*????????? **
	//*?????? **
	//*???1200012957 **
	//*???2012-12-09 **
	//************************

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void moveforward(char * p)
	{
		for (; * p != '\0'; p++)
		{
			*p = (p.Substring(1));
		}
	}

	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		for (; * p != '\0'; p++)
		{
			if (*p == ' ' && *(p - 1) == ' ')
			{
				moveforward(p);
				p--;
			}
		}
		System.out.print(str);
		System.out.print("\n");

		return 0;
	}
}
