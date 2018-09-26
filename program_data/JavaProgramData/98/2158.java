package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String ch = "";
		String p = null;
		int n;
		int i;
		int line = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			*(ch.Substring(i)) = ConsoleInput.readToWhiteSpace(true);
		}
		line = String.valueOfch.length();
		i = 0;
		while (i < n)
		{
			line = String.valueOf(*(ch.Substring(i))).length();
			System.out.print((ch.Substring(i)));
			i++;
			if (i == n)
			{
				break;
			}
			line += String.valueOf(*(ch.Substring(i))).length(); //???????????????????????
		while (line < 80)
		{
			System.out.print(' ');
			System.out.print((ch.Substring(i)));
		i++;
		line++;
		if (i == n)
		{
			break;
		}
		line += String.valueOf(*(ch.Substring(i))).length();
		}
		System.out.print("\n");
		}

			return 0;
	}
}

