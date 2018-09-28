import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int length;
		int i;
		str = new Scanner(System.in).nextLine();
		str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		str2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		length = str1.length();
		q = str;
		p = tangible.StringFunctions.strStr(str, str1);
		if (p != null)
		{
			q = p.Substring(length);
			for (i = 0; str.charAt(i) != p; i++)
			{
				System.out.print(str.charAt(i));
			}
			System.out.print(str2);
			for (; * q != '\0'; q++)
			{
				System.out.print(q);
			}
			System.out.print("\n");
		}
		else
		{
			System.out.print(str);
			System.out.print("\n");
		}
		return 0;
	}
}

