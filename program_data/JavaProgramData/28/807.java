package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[3600]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int len;
		int n;
		len = a.length();
		n = 0;
		for (p = a;p <= a.Substring(len);p++)
		{
			if (*p != ' ')
			{
				n = n + 1;
			}
			else if (*p == ' ' && n != 0)
			{
				System.out.printf("%d,",n);
				n = 0;
			}
		}
		System.out.printf("%d",n - 1);
	}
}
