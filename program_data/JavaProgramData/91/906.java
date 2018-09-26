import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[102]);
		String b = new String(new char[102]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = b;
		int i = a.length();
		int j = 0;
		for (j = 0; j < i - 1; j++)
		{
			*q = p + *(++p);
			q++;
		}
		b = tangible.StringFunctions.changeCharacter(b, i - 1, a.charAt(0) + a.charAt(i - 1));
		q = b;
		for (j = 0; j < i; j++)
		{
			System.out.print(q);
			q++;
		}
		System.out.print("\n");
		return 0;
	}
}

