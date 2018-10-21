package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[30]);
		String p; //:????
		str = new Scanner(System.in).nextLine();
		p = str; //:????

		for (int i = 0;i < p.length() - 1;i++) //:????
		{
			if (p.charAt(i) >= 48 && p.charAt(i) <= 57 && (p.charAt(i + 1) < 48 || p.charAt(i + 1)>57)) //:?????????????????
			{
				System.out.print(p.charAt(i));
				System.out.print("\n");
			}
			else if (p.charAt(i) >= 48 && p.charAt(i) <= 57 && (p.charAt(i + 1) >= 48 && p.charAt(i + 1) <= 57))
			{
				System.out.print(p.charAt(i));
			}
		}
		if (p.charAt(p.length() - 1) >= 48 && p.charAt(p.length() - 1) <= 57) //:?????????
		{
			System.out.print(p.charAt(p.length() - 1));
		}
		System.out.print("\n");
		return 0;
	}

}
