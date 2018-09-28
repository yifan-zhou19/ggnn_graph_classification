package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[5000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = s;
		int n = 0;
		s = new Scanner(System.in).nextLine();
		while (*p != null)
		{
			if (*p == ' ')
			{
				if (n != 0)
				{
					System.out.printf("%d,",n);
				}
				n = 0;
			}
			else
			{
				n++;
			}
			p++;
		}
		System.out.printf("%d\n",n);
		return 0;
	}
}
