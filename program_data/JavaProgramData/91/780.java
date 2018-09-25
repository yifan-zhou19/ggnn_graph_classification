package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[102]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char t;
		a = new Scanner(System.in).nextLine();
		t = a.charAt(0);
		for (p = a.Substring(1); * p != '\0';p++)
		{
			*(p - 1) = *(p - 1) + *p;
		}
		*(p - 1) = *(p - 1) + t;
		for (p = a; * p != '\0';p++)
		{
			System.out.printf("%c",*p);
		}

	}

}
