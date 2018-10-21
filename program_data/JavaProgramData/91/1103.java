package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String string = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int len;
		int i;
		String = new Scanner(System.in).nextLine();
		len = String.length();
		for (p = String;p < string.Substring(len) - 1;p++)
		{
			i = p + *(p + 1);
			System.out.printf("%c",i);
		}
		if (p == string.Substring(len) - 1)
		{
			i = p + *(p - len + 1);
			System.out.printf("%c",i);
		}
		System.out.print("\n");
	}
}
