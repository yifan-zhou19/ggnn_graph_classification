package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * r;
		int i;
		int j = 0;
		int m;
		int e;
		int t;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		for (p = a;p < a + a.length();p++)
		{
			if (*p != *b || (*p == *b && (*(p + b.length()) != ' ') && (*p == *b && *(p + b.length()) != '\0')) || ((*p == *b && *(p) != *a) && (*p == *b && *(p - 1) != ' ')))
			{
				d = tangible.StringFunctions.changeCharacter(d, j, *p);
				j++;
			}
			else if (*p == *b && ((*(p + b.length()) == ' ' || *(p + b.length()) == '\0')) && (*(p - 1) == ' ' || *p == *a))
			{
				q = p;
				m = 0;
			for (i = 0;i < b.length();i++)
			{
				if (*p != *(b.Substring(i)))
				{
				m = 1;
				for (r = q;r <= q.Substring(i);r++)
				{
					*(d.Substring(j)) = *r;
					j++;
				}
				break;
				}
			else
			{
				p++;
			}
			}
			if (m == 0)
			{
				p--;
				for (e = 0;e < c.length();e++)
				{
					*(d.Substring(j)) = *(c.Substring(e));
					j++;
				}
			}
			}
		}
		for (t = 0;t < j;t++)
		{
			System.out.printf("%c",*(d.Substring(t)));
		}
	}
}

