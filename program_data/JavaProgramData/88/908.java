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
			if (*(p.Substring(i)) >= 48 && *(p.Substring(i)) <= 57 && (*(p.Substring(i) + 1) < 48 || *(p.Substring(i) + 1)>57)) //:?????????????????
			{
				System.out.print((p.Substring(i)));
				System.out.print("\n");
			}
			else if (*(p.Substring(i)) >= 48 && *(p.Substring(i)) <= 57 && (*(p.Substring(i) + 1) >= 48 && *(p.Substring(i) + 1) <= 57))
			{
				System.out.print((p.Substring(i)));
			}
		}
		if (*(p + p.length() - 1) >= 48 && *(p + p.length() - 1) <= 57) //:?????????
		{
			System.out.print((p + p.length() - 1));
		}
		System.out.print("\n");
		return 0;
	}


}
