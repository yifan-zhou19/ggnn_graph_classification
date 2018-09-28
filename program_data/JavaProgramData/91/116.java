package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n - 1;i++)
		{
			*(b.Substring(i)) = *(a.Substring(i)) + *(a.Substring(i) + 1);
		}
		*(b.Substring(n) - 1) = *(a.Substring(n) - 1) + *(a);
		*(b.Substring(n)) = '\0';
		System.out.printf("%s",b);
		return 0;
	}
}
