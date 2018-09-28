package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
		String s3 = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		int i;
		int l1;
		int l2;
		int l3;
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		s3 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		p = tangible.StringFunctions.strStr(s1, s2);
		l1 = s1.length();
		l2 = s2.length();
		l3 = s3.length();
		if (p == null)
		{
			System.out.print(s1);
		}
		else
		{
			for (i = 0; s1.charAt(i) < p; i++)
			{
				System.out.print(s1.charAt(i));
			}
			System.out.print(s3);
			for (p = p + l2; * p != '\0'; * p++)
			{
				System.out.print(p);
			}
		}
		return 0;
	}
}

