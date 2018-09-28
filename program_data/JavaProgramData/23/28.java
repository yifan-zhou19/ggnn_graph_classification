package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		String a = new String(new char[100]);
		String p1;
		String p2;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		p1 = a.charAt(n - 1);
		p2 = a.charAt(n - 1);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = p1;
		for (i = n - 1;i >= 0;i--)
		{
			p1 = a.charAt(i);
			if (p1 == ' ')
			{
				for (p = p1.Substring(1);p <= p2;p++)
				{
					System.out.printf("%c",*p);
				}
				System.out.print(" ");
				p2 = p1 - 1;
			}
			if (p1 == a)
			{
				for (p = p1;p <= p2;p++)
				{
					System.out.printf("%c",*p);
				}
			}
		}
	}


}
