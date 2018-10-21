package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		String a = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (p = a;p < a.Substring(n);p++)
		{
			if (*p == ' ')
			{
				if (i != 0)
				{
					System.out.printf("%d,",i);
				}
				i = 0;
			}
			else
			{
				i++;
			}
			if (p == a.Substring(n) - 1)
			{
				break;
			}
		}
		System.out.printf("%d",i);
	}
}
