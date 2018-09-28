package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String a = new String(new char[300]);
		char b;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		b = a;
		for (p = a; * (p + 1) != '\0';p++)
		{
			*p = p + *(p + 1);
		}
		*p += b;
		System.out.println(a);
	}



}
