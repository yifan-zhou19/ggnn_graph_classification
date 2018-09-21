package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pstr;
		String x;
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pa;
		int n;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		pstr = str.Substring(n) - 1;
		pa = a;
		for (;pstr >= str;pstr--)
		{
			if (*pstr == ' ')
			{
				x = pstr;
				pstr++;
				for (; * pstr != ' ' && *pstr != '\0';pstr++)
				{
					*pa = pstr;
					pa++;
				}
				*pa = ' ';
				pa++;
				pstr = x - 1;
			}
		}
		pstr = str;
		for (; * pstr != ' ' && *pstr != '\0';pstr++)
		{
			*pa = pstr;
			pa++;
		}
		for (pa = a;pa < a.Substring(n);pa++)
		{
			System.out.printf("%c",*pa);
		}
	}
}
