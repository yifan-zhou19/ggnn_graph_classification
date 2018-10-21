import java.util.*;

package <missing>;

public class GlobalMembers
{
	//************************
	//* ??? ???????*
	//* 1200012878 ???    *
	//* 12?9?              *
	//************************
	public static int Main()
	{
		String s = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		s = new Scanner(System.in).nextLine();
		int len = s.length();
		int i;
		p = s;
		char temp = s.charAt(0);
		for (i = 0; i <= len - 2; i++)
		{
			*p = p + *(p + 1);
			p++;
		}
		*p = p + temp;
		p = s;
		for (i = 0; i <= len - 1; i++)
		{
			System.out.print(p++);
		}
		return 0;
	}
}
