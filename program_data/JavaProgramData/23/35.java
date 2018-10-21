package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		int n;
		n = str.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		String head;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p3;
		head = str;
		p1 = p2 = p3 = str.Substring(n);
		for (;p1 >= head;p1--)
		{
			if (*p1 == ' ')
			{
				p3 = p1 + 1;
				System.out.printf("%s", p2 == '\0'?"":" ");
				for (;p3 < p2;p3++)
				{
					System.out.printf("%c",*p3);
				}
			p2 = p1;
			}
			else if (p1 == head)
			{
				System.out.printf("%s", p2 == '\0'?"":" ");
				for (p3 = p1;p3 < p2;p3++)
				{
					System.out.printf("%c",*p3);
				}
			}

		}
	}
}
