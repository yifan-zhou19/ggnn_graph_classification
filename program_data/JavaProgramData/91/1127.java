package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		int n = a.length();
		int i;
		char b;
		for (i = 0;i < n - 1;i++)
		{
						   b = a.charAt(i) + a.charAt(i + 1);
						   System.out.printf("%c",b);
		}
		System.out.printf("%c",a.charAt(n - 1) + a.charAt(0));
		return 0;
	}

}
