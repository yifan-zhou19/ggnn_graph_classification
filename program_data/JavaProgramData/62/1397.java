package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		int i;
		int j;
		int k = 0;
		String a = new String(new char[10000]);
		a = new Scanner(System.in).nextLine();
		p = a;
		for (i = 0;i < a.length();i++)
		{
			if (*p != ' ')
			{
			System.out.printf("%c",*p);
			k = 0;
			}
		if (*p == ' ' && k == 0)
		{
			System.out.print(" ");
		k++;
		}
		p++;
		}
	}
}
