package <missing>;

public class GlobalMembers
{
	public static int atgc(char a)
	{
		if (a == 'A' || a == 'G' || a == 'C' || a == 'T')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		double m;
		final String xl1 = "";
		final String xl2 = "";
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			xl1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			xl2 = tempVar3.charAt(0);
		}
		int len1;
		int len2;
		len1 = xl1.length();
		len2 = xl2.length();
		if (len1 != len2)
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			int i;
			int n = 0;
			for (i = 0;i < len1;i++)
			{
				if (atgc(xl1.charAt(i)) == 0 || atgc(xl2.charAt(i)) == 0)
				{
					System.out.print("error");
					return 0;
				}
				else if (xl1.charAt(i) == xl2.charAt(i))
				{
					n++;
				}
			}
			if (1.0 * n / len1 >= m)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}

		return 0;
	}
}

