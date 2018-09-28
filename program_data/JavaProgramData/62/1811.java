import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char[] str = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	public static int flag = 0;
	public static int len;
	public static void clear(tangible.RefObject<String> a)
	{
		if (a.argValue == str)
		{
			System.out.print(a.argValue);
			return;
		}
		else
		{
			if (a.argValue == 32 && flag != 0)
			{
				clear(a.argValue - 1);
			}
			else
			{
				if (a.argValue == 32)
				{
					flag++;
					clear(a.argValue-1);
					System.out.print(' ');
				}
				else
				{
					flag = 0;
					clear(a.argValue-1);
					System.out.print(a.argValue);
				}
			}
		}
	}

	public static int Main()
	{
		str = new Scanner(System.in).nextLine();
		len = str.length();
		clear(str + len - 1);
		return 0;
	}



}

