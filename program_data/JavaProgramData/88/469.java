import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p = a;
	a = new Scanner(System.in).nextLine();
	for (; * p != '\0';p++)
	{
	if (*p >= 48 && *p <= 58)
	{
	System.out.print(p);
	if (*(p + 1) < 48 || *(p + 1)>58)
	{
		System.out.print("\n");
	}
	}
	}
	return 0;
	}
}
