package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int i;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		p = a.charAt(0);
		q = a.charAt(1);
		i = 0;
		while (n > 1)
		{
			b = tangible.StringFunctions.changeCharacter(b, i++, *p + *q);
		 p++;
		 q++;
		 n--;
		}
		b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(0) + *p);
		b = tangible.StringFunctions.changeCharacter(b, i + 1, '\0');
		System.out.printf("%s",b);
	}
}

