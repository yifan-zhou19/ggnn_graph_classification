package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String a = new String(new char[502]);
		String b = new String(new char[502]);
		int c;
		int j;
		int x = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		if (a.length() != b.length())
		{
			c = 0;
		}
		else
		{
			for (j = 0;a.charAt(j);j++)
			{
				if ((a.charAt(j) != 'A' && a.charAt(j) != 'T' && a.charAt(j) != 'C' && a.charAt(j) != 'G') || (b.charAt(j) != 'A' && b.charAt(j) != 'T' && b.charAt(j) != 'C' && b.charAt(j) != 'G'))
				{
					c = 0;
				}
				else
				{
					if (a.charAt(j) == b.charAt(j))
					{
						x++;
					}
				}


			}

		}
		if (c == 0)
		{
			System.out.print("error");
			return 0;
		}
		if (a.length() == b.length() && 1.00 * x / a.length() >= n)
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

