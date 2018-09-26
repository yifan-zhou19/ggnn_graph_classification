package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[105]);
		String p;
		char x;
		int i = 0;
		a = new Scanner(System.in).nextLine();
		p = a;
		x = p;
		for (i = 0; * (p.Substring(i) + 1) != '\0'; i++)
		{
			* (p.Substring(i)) += * (p.Substring(i) + 1);
		}
		* (p.Substring(i)) += x;
		System.out.print(a);

		return 0;
	}
}
