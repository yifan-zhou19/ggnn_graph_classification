package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j;
		int al;
		int bl;
		int cl;
		final String c = "";
		final String a = "";
		final String b = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		c = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		al = a.length();
		bl = b.length();
		cl = c.length();
		for (p = c;p < c.Substring(cl);)
		{
			q = p;
			for (; * q != ' ' && *q != '\0';q++)
			{
				;
			}
			if ((q - p) != al)
			{
				for (;p < q;p++)
				{
					System.out.printf("%c",*p);
				}
				if (q != c.Substring(cl))
				{
					System.out.print(" "),p++;
				}
			}
			else
			{
				for (j = 0,q = p;j < al;q++,j++)
				{
					if (*q != a.charAt(j))
					{
						break;
					}
				}
				if (j == al)
				{
					if (q != c.Substring(cl))
					{
						System.out.printf("%s ",b);
					}
					else
					{
						System.out.printf("%s",b);
					}
					p = p + al + 1;
				}
				else
				{
					for (;p <= q;p++)
					{
						System.out.printf("%c",*p);
					}
				}
			}
		}
	}

}
