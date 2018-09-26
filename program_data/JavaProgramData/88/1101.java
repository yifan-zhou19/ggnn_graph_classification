package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[30]);
		s = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
		for (a = s; * a != '\0';a++)
		{
			if (*a >= '0' && *a <= '9')
			{
				System.out.printf("%c",*a);
			}
			else
			{
				if (a == s)
				{
					continue;
				}
				else
				{
					if (*(a - 1) >= '0' && *(a - 1) <= '9')
					{
						System.out.print("\n");
					}
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}
