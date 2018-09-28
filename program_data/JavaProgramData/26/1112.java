package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a = new String(new char[101]);
		for (p = gets(a); * p;p++)
		{
			if (*p == ' ' && *(p - 1) == ' ')
			{
				continue;
			}
			System.out.printf("%c",*p);
		}
	}

}
