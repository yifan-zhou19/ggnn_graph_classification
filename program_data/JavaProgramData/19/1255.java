package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int t = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a;
		String b;
		String c;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(200 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = p;
		while (*p != '\0')
		{
			if (*p != ' ')
			{
				p = p + 1;
			}
			else
			{
				*p = '\0';
				p = p + 1;
				if (strcmp(c,a) == 0)
				{
					System.out.printf("%s ",b);
				}
				else
				{
					System.out.printf("%s ",c);
				}
				c = p;
			}
		}
		do
		{
			if (strcmp(c,a) == 0)
			{
				System.out.printf("%s",b);
			}
				else
				{
					System.out.printf("%s",c);
				}
				t = 1;
		}while ((*p == '\0') && (t = 0) != 0);
	}
}
