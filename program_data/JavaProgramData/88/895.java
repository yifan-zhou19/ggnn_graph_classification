package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[35]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = c;
		c = new Scanner(System.in).nextLine();
		for (; * p != '\0';p++)
		{
			if (*p <= '9' && *p >= '0')
			{
				System.out.print(p);
			}
			else
			{
				if (*(p + 1) <= '9' && *(p + 1) >= '0')
				{
					System.out.print("\n");
				}
				else
				{
					continue;
				}
			}
		}

		return 0;
	}
}
