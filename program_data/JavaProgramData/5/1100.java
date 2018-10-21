package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		int s = 0;
		int len1;
		int len2;
		int i;
		String b = new String(new char[501]);
		String c = new String(new char[501]);
		String e = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		e = new Scanner(System.in).nextLine();
		len1 = c.length();
		len2 = e.length();
		for (i = 0;i < len1;i++)
		{
			if (c.charAt(i) != 'A' && c.charAt(i) != 'T' && c.charAt(i) != 'C' && c.charAt(i) != 'G')
			{
				len1 = 1;
				break;
			}
		}
		for (i = 0;i < len2;i++)
		{
			if (e.charAt(i) != 'A' && e.charAt(i) != 'T' && e.charAt(i) != 'C' && e.charAt(i) != 'G')
			{
				len2 = 2;
				break;
			}
		}
		if (len1 != len2)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				if (c.charAt(i) == e.charAt(i))
				{
					s++;
				}
			}
			if (1.0 * s / len1 >= n)
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

