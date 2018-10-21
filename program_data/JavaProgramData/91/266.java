package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[111]);
		char first;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		s = new Scanner(System.in).nextLine();
		p = s.charAt(0);
		q = s.charAt(1);
		first = p;

		while (*q != '\0')
		{
			System.out.print((char)((*p) + (*q)));
			*p++;
			*q++;
		}
		System.out.print((char)(*p + first));

		return 0;
	}

}
