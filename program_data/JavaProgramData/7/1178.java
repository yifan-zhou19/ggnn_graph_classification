import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String strpos(String string, String substring)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = String;
		String temp = null;
		while (*p != '\0')
		{
			if (substring[0].equals(*p))
			{
				temp = p;
				p++;
				int i;
				for (i = 1; i < substring.length(); i++)
				{
					if (!substring[i].equals(*p))
					{
						break;
					}
					p++;
				}
				if (i == substring.length())
				{
					break;
				}
				else
				{
					p = temp.Substring(1);
				}
			}
			else
			{
				p++;
			}
		}
		return temp;
	}
	public static int Main()
	{
		String string = new String(new char[256]);
		String substring = new String(new char[256]);
		String replacement = new String(new char[256]);
		String = new Scanner(System.in).nextLine();
		substring = new Scanner(System.in).nextLine();
		replacement = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = strpos(String, substring);
		if (p != null)
		{
			int t = 0;
			int count = 0;
			while (count != substring.length())
			{
				*p = replacement.charAt(t++);
				p++;
				count++;
			}
		}
		System.out.print(String);
		System.out.print("\n");
		return 0;
	}
}
