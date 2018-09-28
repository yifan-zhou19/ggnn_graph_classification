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
			if (*p == ' ')
			{
				if (*(p2 = (p + 1)) == ' ')
				{
					for (; * p2 != '\0';p2++)
					{
						*p2 = (p2 + 1);
					}
					p--;
				}
			}
		}
		for (p = p_1; * p != '\0';p++)
		{
			System.out.printf("%c",*p);
		}
	}

}
