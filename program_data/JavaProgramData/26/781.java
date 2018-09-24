package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] str = new char[100][20]; //?????????
		String p = null; //???????????
		int n = 0;
		int i;
		while ((str[n] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			n++; //???????
		}
		p = str; //????????????p
		System.out.print(p);
		for (i = 1;i < n;i++)
		{
			System.out.print(' ');
			System.out.print((p.Substring(i)));
		}
		System.out.print("\n");
		return 0;
	}
}

