package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String s = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * k;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (p = s.Substring(n) - 1;p > s;p--)
		{
			if (*p == ' ')
			{
				for (k = p + 1;(*k != ' ') && (*k != '\0');k++)
				{
					System.out.printf("%c",*k);
				}
				System.out.print(" ");
			}
		}
		for (;(*p != ' ') && (*p != '\0');p++)
		{
			System.out.printf("%c",*p);
		}
	}

}
