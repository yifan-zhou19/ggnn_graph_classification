package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[300]);
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		String temp;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pb;
		int flag;
		int ls;
		int la;
		int lb;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		ls = s.length();
		la = a.length();
		lb = b.length();
		ps = s;
		pa = a;
		pb = b;
		while (ps < s.Substring(ls))
		{
			flag = 1;
			for (pa = a;((*ps != ' ') && (*ps != '\0'));ps++, pa++)
			{
				if (*ps != *pa)
				{
					flag = 0;
				}
			}
			if ((flag) != 0 && (pa == a.Substring(la)))
			{
				if (la >= lb)
				{
					ps = ps - la;
					while (*pb != '\0')
					{
						*ps++=*pb++;
					}
					if (la > lb)
					{
						while (*(ps + la - lb) != '\0')
						{
							*ps = (ps + la - lb);
							ps++;
						}
						*ps = '\0';
					}
				}
				else
				{
					temp = ps;
					for (ps = s.Substring(ls);ps >= temp;ps--)
					{
						*(ps + lb - la) = *ps;
					}
					ps = ps - la + 1;
					while (*pb != '\0')
					{
						*ps++=*pb++;
					}
				}
				pa = a;
				pb = b;
				ls = s.length();
			}
			ps++;
		}
		ps = s;
		System.out.printf("%s",ps);
	}
}
