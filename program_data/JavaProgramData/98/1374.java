package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		char c;
		int n;
		int i;
		int h;
		int l;
		int countnum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		h = 0;
		for (i = 0;i < n;i++)
		{
			*(a.Substring(i)) = ConsoleInput.readToWhiteSpace(true);



		}
		countnum = 0;
		i = 0;
		while (i < n)
		{
			if ((countnum + String.valueOf(*(a.Substring(i))).length()) < 80)
			{
				if (countnum == 0)
				{
					System.out.print((a.Substring(i)));
				countnum = countnum + String.valueOf(*(a.Substring(i))).length();
				i++;
				}
				else
				{
					System.out.print(" ");
					System.out.print((a.Substring(i)));
					countnum += String.valueOf(*(a.Substring(i))).length() + 1;
					i++;
				}
			}
			else
			{
				System.out.print("\n");
				countnum = 0;
			}
		}

		return 0;
	}

}

