package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] str = new String[1000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		str = new Scanner(System.in).nextLine();
		for (p = str; * p != '\0';p++)
		{
			if (*p == ' ' && *(p + 1) == ' ')
			{
				continue;
			}
			System.out.printf("%c",*p);
		}
	}
}
