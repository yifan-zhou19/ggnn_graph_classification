package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String a = new String(new char[100]);
		int len;
		int i = 0;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		p1 = a;
		p2 = a.Substring(1);
		do
		{
			 System.out.printf("%c", p1 + *p2);
			 p1 = p2;
			 if (p2 == a.Substring(len) - 1)
			 {
				 p2 = a;
			 }
			 else
			 {
				 p2++;
			 }
			 i++;
		}while (i < len);
		return 0;
	}

}
