package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] juzi = new String[1000];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		String * p;

		p = juzi;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		*p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		*p = new Scanner(System.in).nextLine();
		while (strcmp(*p,"end") != 0)
		{
			p = p.Substring(1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			*p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
			*p = new Scanner(System.in).nextLine();

		}
		p--;
		for (;p >= juzi;p--)
		{
			System.out.println(*p);
		}

	}
}
