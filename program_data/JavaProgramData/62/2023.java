import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[100]);
	public static int i;
	public static void sf()
	{
		 int l = a.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		 char * p = a;
		 for (p = a, i = 0; i < l; p++, i++)
		 {
				 if (*p != ' ' || (a.charAt(i) == ' ' && *(p + 1) != ' '))
				 {
					 System.out.print(a.charAt(i));
				 }
		 }
		 return;
	}
	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		sf();
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		return 0;
	}


}

