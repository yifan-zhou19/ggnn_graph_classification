import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count = 0;
		int m;
		char[] sentence = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		sentence = new Scanner(System.in).nextLine();
		p = sentence;
		m = sentence.length();
		while (p - sentence < m)
		{
			if (*p != ' ')
			{
				count = 0;
			}
			if (*p == ' ')
			{
				count++;
			}
			if (count <= 1)
			{
				System.out.print(p);
			}
			p++;
		}
		return 0;
	}
}
