package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (p = a.Substring(n) - 1;p >= a;p--)
		{
	if (*p == ' ' && p != a)
	{
		for (q = p + 1; * q != ' ' && q != a.Substring(n);q++)
		{
	System.out.printf("%c",*q);
		}
		System.out.print(" ");
	}
	if (p == a)
	{
	for (q = a; * q != ' ' && *q != '\0';q++)
	{
	System.out.printf("%c",*q);
	}
	}
		}
	}

}
