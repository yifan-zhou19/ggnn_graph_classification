package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int e = 0;
		int j;
		int n;
		int m;
		String s = new String(new char[256]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);

		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps = s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		n = s.length();
		m = a.length();
		for (i = 0; * ps != '\0';ps++,i++)
		{
			if (*pa == *ps)
			{
				e++;
				for (pa = pa + 1,ps = ps + 1; * pa != '\0';pa++,ps++)
				{
					if (*pa == *ps)
					{
						e++;
					}

				}
			}

			if (e == m)
			{


				p = s;
				for (j = 0;j < i;j++)
				{
					System.out.printf("%c",*p);
					p++;
				}
				System.out.printf("%s",b);
				if (n - i > m)
				{
					for (j = 0;j < m;j++)
					{
						p++;
					}
					System.out.printf("%s",p);
					break;
				}
				else
				{
					break;
				}
			}
			else
			{
				if (e > 0)
				{
				pa = a;
				for (j = 0;j < m;j++)
				{
				   ps--;
				}
				}
			}
			e = 0;
		}

		if (e != m)
		{
			System.out.printf("%s",s);
		}
		return 0;
	}

}
