package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = str;
		char ch;
		ch = p;
		int count = 0;
		while (*p != '\0')
		{
			if (ch > 90)
			{
				ch = ch - 32;
			}
			if (*p == ch || *p == ch + 32)
			{
				count++;
				p++;
			}
			else
			{
				System.out.print("(");
				System.out.print(ch);
				System.out.print(",");
				System.out.print(count);
				System.out.print(")");
				ch = p;
				count = 0;
			}
		}
		System.out.print("(");
		System.out.print(ch);
		System.out.print(",");
		System.out.print(count);
		System.out.print(")");
		System.out.print("\n");
		return 0;
	}
}

