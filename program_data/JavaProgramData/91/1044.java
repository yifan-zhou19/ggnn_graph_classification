package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String a = new String(new char[100001]);
		String p;
		char e;
		char l;
		a = new Scanner(System.in).nextLine();
		p = a;
		l = p;
		for (i = 0;i < a.length() - 1;i++)
		{
			e = (p.Substring(i));
			*(p.Substring(i)) = e + *(p.Substring(i) + 1);
			System.out.printf("%c",*(p.Substring(i)));
		}
		System.out.printf("%c",l + *(p.Substring(i)));
	}

}
