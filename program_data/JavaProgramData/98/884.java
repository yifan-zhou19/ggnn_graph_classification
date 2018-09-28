package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len = 0;
		int l;
		String word = new String(new char[64]);
		final String p = "";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			System.out.print(p);
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = word.length(); //??????????
			if (len + l > 80) // ???????80?
			{
				System.out.print("\n");
				len = 0; //?????????
			}
			else if (i > 0)
			{
				System.out.print(" ");
			}
			len += l + 1;
			p = word;
		}
		System.out.print(p);
		return 0;
	}
}

