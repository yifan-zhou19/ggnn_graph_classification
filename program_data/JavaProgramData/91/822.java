package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < a.length() - 1;i++)
		{
			System.out.printf("%c",*(a.Substring(i)) + *(a.Substring(i) + 1));
		}
		System.out.printf("%c",*a + *(a + a.length() - 1));
	}
}
