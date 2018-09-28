package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * r;
		String str = new String(new char[30]);
		str = new Scanner(System.in).nextLine();
		for (p = str; * p != '\0';)
		{
			if (*p >= '0' && *p <= '9' && *(p - 1) != '-')
			{
				q = p;
				while (*q >= '0' && *q <= '9')
				{
					q++;
				}
				for (r = p;r < q;r++)
				{
					System.out.print(r);
				}
				System.out.print("\n");
				p = q;
			}
			else
			{
				p = p + 1;
			}
		}
		return 0;
	}

}
