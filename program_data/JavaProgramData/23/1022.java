package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void inv(char s[]);
		String c = new String(new char[100]);
		c = new Scanner(System.in).nextLine();
		inv(c);
	}

	public static void inv(String s)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int k;
		k = s.length();
		for (p = s + k - 1;p >= s;p--)
		{
			if (*p == ' ')
			{
				for (q = p + 1; * q != ' ' && *q != '\0';q++)
				{
					System.out.printf("%c",*q);
				}
				System.out.print(" ");
			}
		}
		for (p = s; * p != ' ' && *p != '\0';p++)
		{
			System.out.printf("%c",*p);
		}
	}

}
