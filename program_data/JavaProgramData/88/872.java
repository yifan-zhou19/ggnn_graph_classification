package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int a = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		q = p;
		p = new Scanner(System.in).nextLine();
		while (*q != '\0')
		{
			if (*q <= '9' && *q >= '0')
			{
				System.out.printf("%c",*q);
				a = 0;
			}
			if ((*q > '9' || *q < '0') && a == 0)
			{
				System.out.print("\n");
				a++;
			}
			q++;
		}
	}
}
