import java.util.*;

package <missing>;

public class GlobalMembers
{
	//2.cpp
	//???????
	//?????
	//???12?27?


	public static int Main()
	{
		String s = new String(new char[256]);
		String z = new String(new char[256]);
		String r = new String(new char[256]);
		int i;
		s = new Scanner(System.in).nextLine();
		z = new Scanner(System.in).nextLine();
		r = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = tangible.StringFunctions.strStr(s, z);
		if (p == null)
		{
			System.out.print(s);
		}
		else
		{
			String q = s;
			for (i = 0; i < (p - q); i++)
			{
				System.out.print(s.charAt(i));
			}
			System.out.print(r);
			p = p + (z.length());
			while (*p != '\0')
			{
				System.out.print(p);
				p++;
			}
		}
		return 0;
	}
}

