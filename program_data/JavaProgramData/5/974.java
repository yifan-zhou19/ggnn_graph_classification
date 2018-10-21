package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int x = 0;
		double p;
		double y;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		m = a.length();
		n = b.length();
		if (m != n)
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C' || b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
				{
					System.out.print("error");
					return 0;
				}
				else
				{
					if (a.charAt(i) == b.charAt(i))
					{
						x++;
					}
				}
			}
			y = (double)x / m;
			if (y > p)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
			return 0;
		}
	}

}

