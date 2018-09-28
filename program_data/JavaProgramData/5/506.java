package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		int y;
		int m = 0;
		double n;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		x = a.length();
		y = b.length();
		if (x == y)
		{
			for (i = 0;i < x;i++)
			{
				if (a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T')
				{
					System.out.print("error");
					break;
				}
				else
				{
					if (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T')
					{
						System.out.print("error");
						break;
					}
					else
					{
						if (a.charAt(i) == b.charAt(i))
						{
							m++;
						}
					}
				}
				if (i == x - 1)
				{
					if (1.0 * m / x > n)
					{
						System.out.print("yes");
					}
					else
					{
						System.out.print("no");
					}
				}
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}

