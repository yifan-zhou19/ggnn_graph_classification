import java.util.*;

package <missing>;

public class GlobalMembers
{
	//4.cpp
	//??????????
	//?????
	//???12?7?


	public static int Main()
	{
		String s = new String(new char[200]);
		char a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		s = new Scanner(System.in).nextLine();
		p = s;
		while (*p != '\0')
		{
			if (*(p + 1) == '\0')
			{
				a = p + s.charAt(0);
				System.out.print(a);
			}
			else
			{
				a = p + *(p + 1);
				System.out.print(a);
			}
			p++;
		}
		return 0;
	}

}
