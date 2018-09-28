import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		char ch = str.charAt(0);
		while (p < str + str.length() - 1)
		{
			* p =  p + * (p + 1);
			p++;
		}
		* p += ch;
		* ++p = '\0';
		for (p = str; p < str + str.length(); p++)
		{
			System.out.print(p);
		}
		return 0;
	}


}
