package <missing>;

public class GlobalMembers
{
	public static void daopai(tangible.RefObject<String> pt)
	{
		int i;
		int s = 0;
		int m = 0;
		String[] index = new String[100];
		for (i = 0; * (pt.argValue.Substring(i)) != '\0';i++)
		{
			if ((*(pt.argValue.Substring(i)) != ' ') && (s == 0))
			{
				index[m] = pt.argValue.Substring(i);
				s = 1;
			}
			else if (*(pt.argValue.Substring(i)) == ' ')
			{
				m = m + 1;
				s = 0;
			}
		}
		if (m != 0)
		{
			for (; index[m] != '\0';index[m]++)
			{
			System.out.printf("%c", index[m]);
			}
		System.out.print(" ");
		for (i = (m - 1);i > 0;i--)
		{
			for (; index[i] != ' ';index[i]++)
			{
				System.out.printf("%c", index[i]);
			}
			System.out.print(" ");
		}
		for (; index[0] != ' ';index[0]++)
		{
			System.out.printf("%c", index[0]);
		}
		}
		else
		{
			for (; index[0] != '\0';index[0]++)
			{
				System.out.printf("%c", index[0]);
			}
		}
	}
	public static int Main()
	{
		String str = new String(new char[100]);
		String p = str;
		p = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
		daopai(tempRef_p);
		p = tempRef_p.argValue;
	return 0;
	}
}

