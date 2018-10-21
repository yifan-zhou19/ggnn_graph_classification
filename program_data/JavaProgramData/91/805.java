package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int l;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String p1;
		String p2;
		p1 = s1;
		p2 = s2;
		p1 = new Scanner(System.in).nextLine();
		l = p1.length();
		for (i = 0;i < l - 1;i++)
		{
			*(p2.Substring(i)) = *(p1.Substring(i)) + *(p1.Substring(i) + 1);
		}
		*(p2.Substring(l) - 1) = (p1) + *(p1.Substring(l) - 1);
		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",*(p2.Substring(i)));
		}
	}
}
