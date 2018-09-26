import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int flag = 1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String sentence = new String(new char[100]);
		sentence = new Scanner(System.in).nextLine();
		for (p = sentence ; p <= sentence + sentence.length() - 1 ; p++)
		{
			if (*p != ' ')
			{
				System.out.print(p);
				flag = 1;
			}
			else if (flag)
			{
				System.out.print(' ');
				flag = 0;
			}
		}
		return 0;
	}
}
