package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		String b = new String(new char[300]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		for (p = a,q = b; * (p + 1) != '\0';p++,q++)
		{
			*q = p + *(p + 1);
		}
		*q = p + a.charAt(0);
		*(++q) = '\0';
		System.out.print(b);
	}
}
