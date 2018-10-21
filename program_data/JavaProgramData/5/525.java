package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double p;
		int e = 0;
		int t = 0;
		int f = 0;
		int q = 0;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		if (a.length() != b.length())
		{
			q = 1;
		}
		else
		{
			for (int i = 0;1;i++)
			{
				if (a.charAt(i) == '\0')
				{
					break;
				}
				if (a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T')
				{
					q = 1;
					break;
				}
				if (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T')
				{
					q = 1;
					break;
				}
				if (a.charAt(i) == b.charAt(i))
				{
					e++;
				}
				t++;
			}
		}
		if (q == 1)
		{
			System.out.print("error");
		}
		else
		{
			if (p < 1.0 * e / t)
			{
				System.out.print("yes");
			}
			if (p > 1.0 * e / t)
			{
				System.out.print("no");
			}
		}
		return 0;
	}

}

