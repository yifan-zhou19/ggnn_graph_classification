import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		String a = new String(new char[1001]);
		char temp;
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		while (*p != '\0')
		{
			num = 0;
			if (*p >= 65 && *p <= 90)
			{
				temp = p;
				System.out.print("(");
				System.out.print(p);
				System.out.print(",");
			}
			else if (*p >= 97 && *p <= 122)
			{
				*p = p - 32;
				temp = p;
				System.out.print("(");
				System.out.print(p);
				System.out.print(",");
			}
			p++;
			while (*p == temp || *p == temp + 32)
			{
				num++;
				p++;
			}
			System.out.print(num + 1);
			System.out.print(")");
		}

		return 0;
	}


}
