import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pointer;
		int len;
		int i;
		int flag = 0;
		int j;
		m = new Scanner(System.in).nextLine();
		pointer = m.charAt(0);
		len = m.length();
		for (i = 0;i < len;i++)
		{
			if (*pointer == ' ' && flag == 0)
			{
				flag = 1;
				pointer++;
			}
			else if (*pointer == ' ' && flag == 1)
			{
				for (j = i;j < len - 1;j++)
				{
					m = tangible.StringFunctions.changeCharacter(m, j, m.charAt(j + 1));
				}
				m = tangible.StringFunctions.changeCharacter(m, len - 1, '\0');
				len--;
				i--;
			}
			else
			{
				flag = 0;
				pointer++;
			}
		}
		System.out.print(m);
		return 0;
	}
}

