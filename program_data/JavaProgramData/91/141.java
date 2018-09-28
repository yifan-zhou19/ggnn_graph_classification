package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[201]);
		str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String s = new String(new char[200]);
		int i;
		int len = str.length();
		p = str;
		for (i = 0;i < len - 1;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, *p + *(p + 1));
			p++;
		}
		if (p == str.charAt(len - 1))
		{
			s = tangible.StringFunctions.changeCharacter(s, len - 1, *p + (str.charAt(0)));
		}
		p = s;
		for (i = 0;i < len;i++,p++)
		{
			System.out.printf("%c",*p);
		}
		return 0;
	}





}

