package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int k = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(300 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		for (; * p != '\0';p++)
		{
			if (*p == ' ' && k != 0)
			{
				continue;
			}
			if (*p == ' ' && k == 0)
			{
				k++;
			}
			if (*p != ' ')
			{
				k = 0;
			}
			System.out.print(*p);
		}
	}


}
