import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * j;
		String q;
		String i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = ch;
		ch = new Scanner(System.in).nextLine();
		for (; * p != '\0'; p++)
		{
			if (*p == ' ')
			{
				if (*(p + 1) == ' ')
				{
					for (j = p; * j != '\0'; j++)
					{
						*j = (j + 1);
					}
					p--;
				}
			}
		}
		q = p;
		for (i = ch.charAt(0); i < q; i++)
		{
			System.out.print(i);
		}
		return 0;
	}
}
