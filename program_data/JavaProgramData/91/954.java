import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p_str;
		char temp;
		str = new Scanner(System.in).nextLine();
		temp = str.charAt(0);
		p_str = str;
		while (*(p_str + 1) != '\0')
		{
			*p_str = p_str + *(p_str + 1);
			p_str++;
		}
		*p_str = p_str + temp;
		System.out.print(str);
		return 0;
	}


}
