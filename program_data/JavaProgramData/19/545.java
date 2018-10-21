package <missing>;

public class GlobalMembers
{
	public static int n1;
	public static int n2;
	public static int n3;
	public static String str1 = new String(new char[100]);
	public static String str2 = new String(new char[100]);
	public static String str3 = new String(new char[100]);
	public static int f(tangible.RefObject<String> p)
	{
		int m;
		int n;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * f;
		f = p.argValue;
		for (m = 0;m < n2;m++)
		{
			if ((*f) == str2.charAt(m))
			{
				n++;
			}
			f++;
		}
		if (n == n2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int m(tangible.RefObject<String> p)
	{
		if (p.argValue >= 'a' && p.argValue <= 'z')
		{
			return 1;
		}
		else if (p.argValue >= 'A' && p.argValue <= 'Z')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		str1 = new Scanner(System.in).nextLine();
		n1 = str1.length();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str2 = tempVar.charAt(0);
		}
		n2 = str2.length();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str3 = tempVar2.charAt(0);
		}
		n3 = str3.length();
		int i = 0;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		p1 = str1;
		for (i = 0;(p1 - str1) < n1;i++,p1++)
		{
			p2 = p1 + n2;
		tangible.RefObject<String> tempRef_p1 = new tangible.RefObject<String>(p1);
		tangible.RefObject<String> tempRef_p2 = new tangible.RefObject<String>(p2);
			if ((f(tempRef_p1) == 1) && (m(p1 - 1) == 0) && (m(tempRef_p2) == 0))
			{
				p2 = tempRef_p2.argValue;
				p1 = tempRef_p1.argValue;
				for (j = 0;j < n3;j++)
				{
					System.out.printf("%c",str3.charAt(j));
				}
				p1 = p1 + n2 - 1;
			}
			else
			{
				p2 = tempRef_p2.argValue;
				p1 = tempRef_p1.argValue;
				System.out.printf("%c",*p1);
			}
		}
	}
}

