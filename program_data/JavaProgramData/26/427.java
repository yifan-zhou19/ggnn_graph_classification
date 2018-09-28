package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * b;
		a = new Scanner(System.in).nextLine();
		for (b = a; * b != 0;b++)
		{
			if (!(*b == ' ' && *(b - 1) == ' '))
			{
				System.out.printf("%c",*b);
			}
		}
		System.out.print("\n");
		System.in.read();
	}

}
