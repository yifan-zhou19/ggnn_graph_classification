package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s;
		String a;
		String b;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String c;
		char n;
		String end;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		c = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		p = s;
		end = s + s.length();
		for (;;)
		{
			sscanf(p,"%s",c);
			if (strcmp(c,a) == 0)
			{
				System.out.printf("%s",b);
			}
			else
			{
				System.out.printf("%s",c);
			}
			p = p + c.length() + 1;
			if (p >= end)
			{
				break;
			}
			System.out.printf("%c",' ');
		}
	}

}
