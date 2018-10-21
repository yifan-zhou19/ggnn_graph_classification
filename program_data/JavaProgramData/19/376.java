package <missing>;

public class GlobalMembers
{
	public static String sen = new String(new char[200]);
	public static String a = new String(new char[100]);
	public static String b = new String(new char[100]);
	public static String re = new String(new char[400]);
	public static int alen;
	public static int blen;

	public static int test(int n)
	{
		int j = 0;
		String p1;
		String p2;
		p1 = sen.Substring(n);
		p2 = a;
		if (n != 0)
		{
			if (*(p1 - 1) != ' ')
			{
				return 0;
			}
		}
		do
		{
			if (p1 != p2)
			{
				j = 1;
			}
				p1 = p1.Substring(1);
				p2 = p2.Substring(1);
		}while (p2 - a < alen);
		if (p1 != ' ' && p1 != '\0')
		{
			return 0;
		}
		if (j == 0)
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

		int l;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * write = re;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * read = sen;
		sen = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		alen = a.length();
		blen = b.length();
		for (;read - sen < 200;read++)
		{
			if (test(read - sen) == 1)
			{

				for (l = 0;l < blen;l++)
				{
					*(write + l) = b.charAt(l);
				}
				write += blen;
				read += alen - 1;
			}
			else
			{
				*write = read;
				write++;
			}
		}

		System.out.printf("%s",re);
	}

}
