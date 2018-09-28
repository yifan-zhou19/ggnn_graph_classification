import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		char b;
		a = new Scanner(System.in).nextLine();
		p = a;
		do
		{
			b = p;
			p++;
			b = b + *p;
			System.out.print(b);
		}while (*(p + 1) != '\0');
		b = p;
		p = a;
		b = b + *p;
		System.out.print(b);
		System.out.print("\n");
		return 0;
	}

}
