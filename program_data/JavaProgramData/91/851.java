import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String series = new String(new char[101]);
		series = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = series;
		char initial = p;
		String trans = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = trans;
		for (; p < series + series.length() - 1; p++, q++)
		{
			*q = p + *(p + 1);
		}
		*q = p + initial;
		*(q + 1) = '\0';
		System.out.print(trans);
		System.out.print("\n");
		return 0;
	}
}
