package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s;
		String a;
		String b;
		String c;
		String e;
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
		e = s + s.length();
		for (;;)
		{
			sscanf(s,"%s",c);
			if (strcmp(a,c) == 0)
			{
				System.out.printf("%s",b);
			}
			else
			{
				System.out.printf("%s",c);
			}
			s = s + c.length() + 1;
			if (s >= e)
			{
				break;
			}
			System.out.print(" ");
		}
	}

}
