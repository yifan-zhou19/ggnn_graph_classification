import java.util.*;

package <missing>;

public class GlobalMembers
{
	//????????
	//2010?11?23?
	//1000012753 ???
	public static int Main()
	{
		int len;
		int count = 0;
		int num;
		String str = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (p = str; p < str.Substring(len); ++p)
		{
			if (*p == ' ' && *(p + 1) == ' ')
			{
				num = 0;
				while (*(p + 1) == ' ')
				{
					p++;
					num++;
				}
				*(p - num + 1) = '\0';
				str += p + 1;
				len = len - num;
				p = p - num;
			}
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}
