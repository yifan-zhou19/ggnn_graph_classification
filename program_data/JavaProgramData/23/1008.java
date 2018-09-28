package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		int l;
		int j;
		int i;
		int m = 0;
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		l = a.length();
		for (p = a.charAt(l - 1);p >= a.charAt(0);p--)
		{
			if (*p == ' ')
			{
				*p = '\0';
				System.out.printf("%s ",p + 1);
			}
		}
		p = a;
		System.out.printf("%s",p);
	}
}
