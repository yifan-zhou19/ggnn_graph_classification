package <missing>;

public class GlobalMembers
{
	public static void myPrint()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		if (strcmp(str,"end"))
		{
			myPrint();
		}
		else
		{
			return;
		}
		System.out.println(str);
	}

	public static int Main()
	{
		myPrint();

		return 0;
	}

}
