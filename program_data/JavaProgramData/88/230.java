package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(30 * (Character.SIZE / Byte.SIZE));

		str = new Scanner(System.in).nextLine();

		for (p = str; * p != '\0';p++)
		{
			if ((*p > '9' || *p < '0') && (*(p + 1) <= '9' && *(p + 1) >= '0'))
			{
				System.out.print("\n");
			}
			if ((*p) <= '9' && (*p) >= '0')
			{
				System.out.printf("%c",*p);
			}
		}
	}

}
