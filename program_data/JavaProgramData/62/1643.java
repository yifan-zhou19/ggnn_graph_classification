package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[1000]);

	public static int Main()
	{
		a = new Scanner(System.in).nextLine();
		String p = a;
		System.out.print(p);
		for (int i = 1; i < a.length(); i++)
		{
			if (*(p.Substring(i) - 1) == ' ' && *(p.Substring(i)) == ' ')
			{
				continue;
			}
			System.out.print((p.Substring(i)));
		}
	}

}
