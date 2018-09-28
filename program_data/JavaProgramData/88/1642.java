import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		p = str;
		int len = str.length();
		for (p = str ; p < str.Substring(len) ; p++)
		{
			if ((int) * p >= 48 && (int) * p <= 57)
			{
				if (((int) * (p - 1) < 48 || (int) * (p - 1) > 57) && p != str)
				{
					System.out.print("\n");
				}
				System.out.print(p);
			}
		}
		System.out.print("\n");
		return 0;
	}
}
