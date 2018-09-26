package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[150]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		str = new Scanner(System.in).nextLine();
		p = str;
		q = str;
		while (*(p + 1) != '\0')
		{
					   System.out.print((char)((int) * p + (int)(*(p + 1))));
					   p++;
		}
		if (*(p + 1) == '\0')
		{
						System.out.print((char)((int) * p + (int) q));
		}
		return 0;
	}


}
