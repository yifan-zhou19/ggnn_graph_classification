package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String p_1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		p_1 = p;
		p = new Scanner(System.in).nextLine();
		for (p = p_1; * p != '\0';p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				System.out.printf("%c",*p);
			}
			else
			{
				for (p2 = p; * p2 != '\0';p2++)
				{
					if (*p2 >= '0' && *p2 <= '9')
					{
						System.out.print("\n");
						break;
					}
				}
			}
		}
	}
}
