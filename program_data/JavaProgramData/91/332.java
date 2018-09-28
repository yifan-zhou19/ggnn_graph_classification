import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i;
		int i;
		String s = new String(new char[102]);
		char k;
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = s;
		k = p; //????
		for (i = 0;i < s.length() - 1;i++)
		{
			*p += *(p + 1);
			p++;
		} //???????
		*p = p + k; //??????
		System.out.print(s);
		return 0;
	}

}
