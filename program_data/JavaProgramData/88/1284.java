package <missing>;

public class GlobalMembers
{
	public static int shuzi(char a)
	{
			if (48 <= a && a <= 57)
			{
				return 0;
			}
			else
			{
				return 1;
			}
	}
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		while (*p != '\0')
		{
			if (shuzi(*p) == 0)
			{
				System.out.print(p);
			}
			if (shuzi(*p) == 1 && shuzi(*(p - 1)) == 0)
			{
				System.out.print("\n");
			}
			p++;
		}
		return 0;
	}

}
