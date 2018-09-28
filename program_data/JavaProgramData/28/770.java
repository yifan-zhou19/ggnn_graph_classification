package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *c=(char *)malloc(1000 *sizeof(char)),*p=c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char c = (String)malloc(1000 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = c;
		int i = 0;
		int flag = 1;
		c = new Scanner(System.in).nextLine();
		for (p = c; * p != '\0';p++)
		{
			if (*p == ' ' && flag == 0)
			{
				i = 0;
			}
			else if (*p == ' ' && flag == 1)
			{
				System.out.printf("%d,",i),flag = 0,i = 0;
			}
			else if (*p != ' ')
			{
				i++,flag = 1;
			}
		}
		if (*p == '\0' && flag == 1)
		{
			System.out.printf("%d",i);
		}
	}

}
