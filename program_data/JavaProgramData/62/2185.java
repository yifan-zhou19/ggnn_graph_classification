import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		int flag = 1;
		int i = 0;
		for (p = a; * p;p++)
		{
			if (*p == ' ' && flag == 1)
			{
					flag = 0;
					b = tangible.StringFunctions.changeCharacter(b, i++, *p);
			}
			else if (*p == ' ' && flag == 0)
			{
						;
			}
			else
			{
				flag = 1;
				b = tangible.StringFunctions.changeCharacter(b, i++, *p);
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		System.out.print(b);
		System.out.print("\n");
		return 0;
	}

}

