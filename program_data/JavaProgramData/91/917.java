import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j;
		String s = new String(new char[101]);
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		s = new Scanner(System.in).nextLine();
		p = s.Substring(1);
		for (; * p != '\0'; p++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, *p + *(p - 1));
			i++;
		}
		a = tangible.StringFunctions.changeCharacter(a, i, *(p - 1) + s.charAt(0));
		for (j = 0; j <= i; j++)
		{
			System.out.print(a.charAt(j));
		}
		return 0;
	}

}

