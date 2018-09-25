package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;

		String str = new String(new char[101]);
		String bud = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;i < n;i++)
		{
			*(bud.Substring(i)) = *(str + (i % n)) + *(str + ((i + 1) % n));
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%c",*(bud.Substring(i)));
		}
		return 0;
	}
}
