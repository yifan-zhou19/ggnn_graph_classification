package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[30]);
			 str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = str;
		int num = 0;
		for (; * p != '\0';p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				num = num * 10 + (*p - '0');
				p++;
				if (!(*p >= '0' && *p <= '9') || *p == '\0')
				{
					System.out.print(num);
					System.out.print("\n");
					num = 0;
				}
				p--;
			}
		}
		return 0;
	}

}
