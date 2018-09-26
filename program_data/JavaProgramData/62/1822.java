import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		sentence = new Scanner(System.in).nextLine();
		p = sentence;
		int len = sentence.length();
		int i = 0;
		while (i < len)
		{
			if (*p != ' ')
			{
				System.out.print(p++);
				i++;
			}
			else
			{
				System.out.print(' ');
				p++;
				i++;
				while (*p == ' ')
				{
					p++;
					i++;
				}
			}
		}

	return 0;
	}




}
