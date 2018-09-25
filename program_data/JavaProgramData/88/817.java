package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * c;
		int k = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		c = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		c = new Scanner(System.in).nextLine();
		for (; * c != '\0';c++)
		{
			if ((*c < 48) || (*c>57))
			{
			   k = 0;
			}
			else if (k == 0)
			{
				System.out.printf("\n%c",*c);
				k = 1;
			}
			else
			{
			   System.out.printf("%c",*c);
			}
		}
	}
}
