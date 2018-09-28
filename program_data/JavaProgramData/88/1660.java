package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[35]);
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps = s;
		int i = 0;
		int num = 0;
		for (; * ps; ps++)
		{
			if (*ps >= '0' && *ps <= '9')
			{
				num += *ps - '0';
				num *= 10;
				i = 1;
			}
			else if (i == 1)
			{
				System.out.printf("%d\n", num / 10);
				num = 0;
				i = 0;
			}
		}
		if (i == 1)
		{
			System.out.printf("%d\n", num / 10);
		}
		return 0;
	}
}
