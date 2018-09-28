package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String x = new String(new char[101]);
		String p;
		int i;
		x = new Scanner(System.in).nextLine();
		p = x;
		for (i = 0 ; * (p.Substring(i) + 1) != '\0' ; i++)
		{
			System.out.print((char)(*(p.Substring(i)) + *(p.Substring(i) + 1)));
		}
		System.out.print((char)(*(p.Substring(i)) + p));
		System.out.print("\n");
		return 0;
	}

}
