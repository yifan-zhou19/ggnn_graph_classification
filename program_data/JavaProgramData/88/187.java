package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * c;
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		c = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
		int a = 0;
		p = c;
		c = new Scanner(System.in).nextLine();
		for (c = p; * c != '\0';c++)
		{
			if (*c >= '0' && *c <= '9')
			{
				System.out.printf("%c",*c);
				a = 1;
			}
			else if (a == 1)
			{
				for (p1 = c; * p1 != '\0';p1++)
				{
					if (*p1 >= '0' && *p1 <= '9')
					{
						System.out.print("\n");
						a = 0;
						break;
					}
				}
			}
		}
	}
}
