package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		String a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(30 * (Integer.SIZE / Byte.SIZE));
		a = new Scanner(System.in).nextLine();

		l = a.length();
		for (p = a;p < a.Substring(l);p++)
		{
			if ((*p >= 48) && (*p <= 57))
			{
				System.out.printf("%c",*p);
			}
			else
			{
				System.out.print("\n");
			}
		}
		System.out.print("\n");
	}

}
