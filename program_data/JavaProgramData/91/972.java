package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		String p1 = s1;
		String p2 = s2;
		p1 = new Scanner(System.in).nextLine();
		int i;
		int l = p1.length();
		*(p2.Substring(l)) = 0;
		for (i = 0;i <= l - 1;i++)
		{
			*(p2.Substring(i)) = *(p1.Substring(i)) + *(p1.Substring(i) + 1);
		}
		*(p2.Substring(l) - 1) += p1;
		System.out.println(p2);
	}
}
