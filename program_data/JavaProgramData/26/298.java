import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************************
	//???????????
	//??????
	//?????2010.12.10
	//????????????
	//****************************************
	public static int Main()
	{
		String str = new String(new char[1000]);
		str = new Scanner(System.in).nextLine();
		int count = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		for (p = str;p < (str.Substring(1000)); p++)
		{
			if (*p == '\0')
			{
				break;
			}
			else if (*p != ' ')
			{
				System.out.print(p);
			}
			else
			{
				count++;
			}
			if ((count > 1) && (*p == ' ') && (*(p + 1) == ' '))
			{
				continue;
			}
			if (count == 1)
			{
				System.out.print(p);
			}
			if ((*p == ' ') && (*(p + 1) != ' '))
			{
				count = 0;
			}
		}
		return 0;
	}
}
