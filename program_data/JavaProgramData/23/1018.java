package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		String r;
		int i;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (p = a;p < a.Substring(n) - 1;p++)
		{
			;
		}
		q = p;
		for (i = 0;i < n;i++)
		{
			if (*--p == ' ')
			{
				r = p;
				for (;p < q;)
				{
					System.out.printf("%c",*++p);
				}
				System.out.print(" ");
				p = r;
				q = p - 1;
			}
		}
		for (p = a;p < q.Substring(1);p++)
		{
			System.out.printf("%c",*p);
		}
	}
}
