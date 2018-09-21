package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int m;
		int n;
		int q;
		int s = 0;
		String a = new String(new char[111]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;a.charAt(i) != '\0' && a.charAt(i) != ' ';i++)
		{
			s = s + 1;
		}
		if (s == n)
		{
			System.out.printf("%s",a);
		}
		else
		{
		q = a.Substring(n);
		for (p = a.Substring(n);p >= a.Substring(s);p--)
		{
			if (*p == ' ')
			{
				m = p;
				for (p = m + 1;p < q;p++)
				{
					System.out.printf("%c",*p);
				}
				System.out.print(" ");
				q = m;
				p = m;
			}
		}
		p = a;
		for (i = 0;i < s;i++)
		{
			System.out.printf("%c",*p++);
		}
		}
	}
}
