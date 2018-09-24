import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * r;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * w;
		r = w = null;
		str = new Scanner(System.in).nextLine();
		r = w = str;
		while (*r != '\0')
		{
			*w = r;
			if (*r == ' ')
			{
				while (*r == ' ')
				{
					r++;
				}
				r--;
			}
			w++;
			r++;
		}
		*w = '\0';
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}
