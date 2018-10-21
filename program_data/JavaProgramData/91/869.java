import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa = a;
		String b = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pb = b;
		a = new Scanner(System.in).nextLine();
		for (pa = a; pa < a + a.length() - 1; pa++)
		{
			*pb++= *pa + *(pa + 1);
		}
		*pb++= *pa + *a;
		*pb = '\0';
		System.out.print(b);
		System.out.print("\n");
		return 0;
	}

}
