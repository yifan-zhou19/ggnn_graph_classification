package <missing>;

public class GlobalMembers
{
	public static void P(char a,char b)
	{
		int m;
		int n;
		m = a;
		n = b;
		System.out.printf("%c",m + n);
	}
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n - 1;i++)
		{
			P(str.charAt(i), str.charAt(i + 1));
		}
		a = str.charAt(0);
		b = str.charAt(n - 1);
		System.out.printf("%c",a + b);
		return 0;
	}
}
