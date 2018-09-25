package <missing>;

public class GlobalMembers
{
	public static void Main()
	{


//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s;
		String a;
		String b;
		String p;
		String end;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		b = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		end = s + s.length();
		for (;;)
		{
			sscanf(s,"%s",p);
			if (strcmp(p,a) == 0)
			{
				System.out.printf("%s",b);
			}
			else
			{
				System.out.printf("%s",p);
			}
			s = s + p.length();
			if (s >= end)
			{
				break;
			}
			s++;
			System.out.print(" ");
		}
	}

}
