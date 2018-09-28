import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int j = 0;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		String i;
		a = new Scanner(System.in).nextLine();
		p = a;
		i = a;
		q = b;
		for (; * p != '\0';p++,q++)
		{
			j++;
			if (*(p + 1) == '\0')
			{
				*q = p + i;
			}
			else
			{
				*q = p + *(p + 1);
			}
		}
		for (int k = 0;k <= j - 1;k++)
		{
			System.out.print(b.charAt(k));
		}
		return 0;
	}
}
