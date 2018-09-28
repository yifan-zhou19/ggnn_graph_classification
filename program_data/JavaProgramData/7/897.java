package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c = ConsoleInput.readToWhiteSpace(true).charAt(0);
		p = tangible.StringFunctions.strStr(a, b);
		if (p != null)
		{
			for (i = 0;i < p - a;i++)
			{
				System.out.print(a.charAt(i));
			}
			System.out.print(c);
			for (p = p + b.length();p < a + a.length();p++)
			{
				System.out.print(p);
			}
		}
		else
		{
			System.out.print(a);
		}
		System.out.print("\n");
		return 0;
	}

}

