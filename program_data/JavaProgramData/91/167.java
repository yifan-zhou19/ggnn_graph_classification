package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		int i;
		int n = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = str.charAt(1);
		n = str.length();
		for (i = 0;i < n;i++,p++,q++)
		{
						if (i != n - 1)
						{
						System.out.printf("%c",* p + * q);
						}
						if (i == n - 1)
						{
						  q = str;
						System.out.printf("%c",* p + * q);
						}
		}
		 return 0;
	}

}
