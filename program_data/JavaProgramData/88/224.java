package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc((Character.SIZE / Byte.SIZE) * 31);
		p = new Scanner(System.in).nextLine();
		while (*p != '\0')
		{
			if (*p >= '0' && *p <= '9')
			{
				if (n != 0)
				{
					System.out.printf("\n%c",*p);
				}
				else
				{
					System.out.printf("%c",*p);
				}
				n = 0;
			}
			else
			{
				n++;
			}
			p++;
		}
	}


}
