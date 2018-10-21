import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len = 0;
		String str = new String(new char[32]);
		String temp = new String(new char[32]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ptr;
		str = new Scanner(System.in).nextLine();
		ptr = str;
		for (; * ptr != '\0';++ptr)
		{
			if (Character.isDigit(*ptr))
			{
				len++;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(temp,0,(Character.SIZE / Byte.SIZE));
				if (len == 0)
				{
					continue;
				}
				for (i = 0;i < len;++i)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, len - i - 1, *(ptr - i - 1));
				}
				len = 0;
				System.out.print(Integer.parseInt(temp));
				System.out.print("\n");
			}
		}
		if (len != 0)
		{
			for (i = 0;i < len;++i)
			{
				temp = tangible.StringFunctions.changeCharacter(temp, len - i - 1, *(ptr - i - 1));
			}
			System.out.print(Integer.parseInt(temp));
			System.out.print("\n");
		}
		return 0;
	}

}

