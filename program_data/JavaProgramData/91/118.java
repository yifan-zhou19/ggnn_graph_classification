package <missing>;

public class GlobalMembers
{
	public static void process(tangible.RefObject<String> pt, int number)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * b;
		char head;
		head = pt.argValue;
		for (b = pt.argValue;b < pt.argValue.Substring(number) - 1;b++)
		{
			*b = b + *(b + 1);
		}
		*(pt.argValue.Substring(number) - 1) = *(pt.argValue.Substring(number) - 1) + head;
		for (b = pt.argValue;b < pt.argValue.Substring(number);b++)
		{
			System.out.printf("%c",*b);
		}
	}

	public static int Main()
	{
		String A = new String(new char[101]);
		String pt;
		int number;
		A = new Scanner(System.in).nextLine();
		number = A.length();
		pt = A;
	tangible.RefObject<String> tempRef_pt = new tangible.RefObject<String>(pt);
		process(tempRef_pt, number);
		pt = tempRef_pt.argValue;
		return 0;
	}
}

