package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		char t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		int count = 0;
		str = new Scanner(System.in).nextLine();
		for (p = str; * p != '\0'; p++)
		{
			if (*(p - 1) == ' ' && *p == ' ')
			{
				for (q = p; ; q++)
				{
					t = q;
					*q = (q + 1);
					*(q + 1) = t;
					if (*q == '\0')
					{
						break;
					}
				}
				if (*p == ' ')
				{
					p--;
				}
			}
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}
