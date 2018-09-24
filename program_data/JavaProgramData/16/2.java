package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		a = (String)malloc(1000);
		a = new Scanner(System.in).nextLine();

		for (p = a; * p != '\0';p++)
		{
			;
		}
		p--;
		for (;p >= a;p--)
		{
			System.out.printf("%c",*p);
		}


	}
}
