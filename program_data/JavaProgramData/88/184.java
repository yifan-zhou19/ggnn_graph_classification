package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a = new String(new char[30]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();
		p = a;
		for (p = a; * p != '\0';p++)
		{
			if (*p >= 48 && *p <= 57)
			{
				System.out.printf("%c",*p);
				if (*(p + 1) < 48 || *(p + 1)>57)
				{
					System.out.print("\n");
				}
			}
		}
	}
}
