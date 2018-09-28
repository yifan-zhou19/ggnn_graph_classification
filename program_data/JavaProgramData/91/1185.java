package <missing>;

public class GlobalMembers
{
	public static String s1 = new String(new char[100]);
	public static String s2 = new String(new char[100]);
	public static int Main()
	{
		int i;
		int j;
		int k;
		int d;
		s1 = new Scanner(System.in).nextLine();
		d = s1.length();
		for (i = 0;i < d - 1;i++)
		{
			*(s2.Substring(i)) = *(s1.Substring(i)) + *(s1.Substring(i) + 1);
		}
		*(s2.Substring(d) - 1) = *(s1.Substring(d) - 1) + *s1;
		System.out.println(s2);
		return 0;
	}
}
