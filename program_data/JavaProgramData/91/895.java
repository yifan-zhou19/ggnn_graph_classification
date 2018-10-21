import java.util.*;

package <missing>;

public class GlobalMembers
{
	/******************************************
	/* ?  ?: ???????
	/* ?  ?: ???  1200012861
	/* ?  ?: 2012?11?30?
	******************************************/


	public static int Main()
	{
		String str = new String(new char[105]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		char b;
		int i;
		int len;

		str = new Scanner(System.in).nextLine();
		len = str.length();

		p = str; //?????p???????
		q = str.Substring(1); //?????q???????

		for (i = 1; i < len; i++)
		{
			b = p + ++ *q++;
			System.out.print(b);
		}
		char a = str.charAt(0) + str.charAt(len - 1);
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}

}
