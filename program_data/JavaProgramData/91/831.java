package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		String str = new String(new char[200]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		//freopen("input.txt","r",stdin);
		//freopen("output.txt","w",stdout);
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (p = str; * (p + 1); p++)
		{
			System.out.printf("%c", *p + *(p + 1));
		}
		System.out.printf("%c\n", *p + *str);
		return 0;
	}

}
