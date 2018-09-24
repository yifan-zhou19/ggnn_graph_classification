package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String str = new String(new char[2100]);
		int len;
		int i;
		int n;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (i = 0, p = str.charAt(0), n = -1;i < len;i++, p++)
		{
			if (*p == ' ' && i - n - 1 != 0)
			{
				System.out.printf("%d,",i - n - 1),n = i;
			}
			if (*p == ' ' && i - n - 1 == 0)
			{
				n = i;
			}
			if (i == len - 1)
			{
				System.out.printf("%d",i - n);
			}
		}
	}
}
