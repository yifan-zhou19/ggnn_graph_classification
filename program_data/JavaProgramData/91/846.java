package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		String str1 = new String(new char[100]);
		int i;
		int len;
		String p;
		String p1;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		p = str;
		p1 = str1;
		for (i = 0;i < len - 1;i++)
		{
			*(p1.Substring(i)) = (char)((int) * (p.Substring(i)) + (int) * (p.Substring(i) + 1));
		}
		*(p1.Substring(len) - 1) = (char)((int) * (p.Substring(len) - 1) + (int) * (p.Substring(0)));
		for (i = 0;i < len;i++)
		{
			System.out.printf("%c",*(p1.Substring(i)));
		}
	}
}
