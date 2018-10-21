package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char * p = (String)malloc(31 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		for (; * p != '\0';p++)
		{
			if (*p > 47 && *p < 58)
			{
				System.out.printf("%c",*p);
			}
			if ((*(p - 1) > 47 && *(p - 1) < 58) && (*p < 48 || *p>57))
			{
				System.out.print("\n");
			}
		}
	}


}
