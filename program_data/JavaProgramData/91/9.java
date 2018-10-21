package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a;
		int i;
		s = new Scanner(System.in).nextLine();
		a = s;
		for (p = s; p < s + s.length() - 1; p++)
		{
			System.out.printf("%c",*p + *(p + 1));
		}
		System.out.printf("%c",*p + a);
	}

}
