import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int[] d = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * q;
		int l;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		for (p = s, q = d; * p != '\0';p++,q++)
		{
			if (*p == ' ')
			{
				if (*(p - 1) == ' ')
				{
					*q = 1;
				}
			}
		}
		p = s;
		q = d;
		for (int j = 0; j < l;j++)
		{
			if (*q == 0)
			{
				System.out.print(p);
			}
			p++;
			q++;
		}
		return 0;
	}

}
