package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int g;
		int cco = 0;
		g = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String b = new String(new char[45]);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(b);
		cco = b.length();
		for (int i = 1;i < g;i++)
		{
			String a = new String(new char[45]);
			String p = a;
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			cco += a.length();
			if (cco < 80)
			{
				System.out.print(" ");
				System.out.print(p);
				cco++;
			}
			else
			{
				cco = 0;
				System.out.print("\n");
				System.out.print(p);
				cco += a.length();
			}
		}
	return 0;
	}

}

