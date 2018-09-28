package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		int i;
		int len;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len - 1;i++)
		{
		*(b.Substring(i)) = *(a.Substring(i)) + *(a.Substring(i) + 1);
		}
		*(b.Substring(len) - 1) = *(a.Substring(len) - 1) + *(a.Substring(0));
		for (i = 0;i < len;i++)
		{
		System.out.printf("%c",*(b.Substring(i)));
		}
		return 0;
	}

}
