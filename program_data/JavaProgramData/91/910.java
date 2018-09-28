import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int b1;
		int b2;
		int t;
		a = new Scanner(System.in).nextLine();
		t = a.charAt(0);
		for (p = a.Substring(1); * p != '\0'; p++)
		{
			b1 = (p - 1);
			b2 = p;
			*(p - 1) = b1 + b2;
		}
		b1 = (p - 1);
		*(p - 1) = b1 + t;
		for (p = a; * p != '\0'; p++)
		{
			System.out.print(p);
		}
		System.out.print("\n");

		return 0;
	}

}
