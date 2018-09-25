package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String b = new String(new char[100]);
		p = a;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n - 1;i++,p++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, *p + *(p + 1));
		}
		b = tangible.StringFunctions.changeCharacter(b, n - 1, a.charAt(0) + a.charAt(n - 1));
		p = b;
		for (i = 0;i < n;i++,p++)
		{
			System.out.printf("%c",*p);
		}
	}
}

