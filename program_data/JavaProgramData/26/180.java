package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		str = new Scanner(System.in).nextLine();
		p = str;
		do
		{
			if (*p != ' ')
			{
				System.out.print(p);
				p++;
			}
			else
			{
				if (*(p + 1) == ' ')
				{
					p++;
				}
				else
				{
					System.out.print(p);
					p++;
				}
			}
		} while (*p != '\0');
		System.out.print("\n");
		return 0;
	}
}
