package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(5 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = str;
		str = new Scanner(System.in).nextLine();
		for (p = str + str.length() - 1;p >= str;p--)
		{
			System.out.printf("%c",*p);
		}

	}
}
