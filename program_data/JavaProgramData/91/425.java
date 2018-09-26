package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String s = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char i;
		char c;
		int x;
		s = new Scanner(System.in).nextLine();
		x = s.length();
		c = s.charAt(0);
		p = s;
		for (i = 0;i < x - 1;i++,p++)
		{
			*(p) = (p) + *(p + 1);
		}
		s = tangible.StringFunctions.changeCharacter(s, x - 1, s.charAt(x - 1) + c);
		System.out.printf("%s",s);
		return 0;
	}
}

