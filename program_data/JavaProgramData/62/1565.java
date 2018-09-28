import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pointer = null;
		str = new Scanner(System.in).nextLine();
		pointer = str;
		while (*pointer != '\0')
		{
			if (*pointer != ' ')
			{
					System.out.print(pointer);
					pointer++;
			}
			else
			{
				while (*(pointer + 1) == ' ')
				{

						pointer++;
				}
				pointer++;
				System.out.print(' ');
			}
		}
		return 0;
	}
}
