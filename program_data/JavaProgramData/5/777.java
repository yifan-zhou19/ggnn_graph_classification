package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int c = 0;
		double n;
		double x = 0;
		double y = 0;
		String a = new String(new char[600]);
		String b = new String(new char[600]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}

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

		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T') || (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T'))
			{
				System.out.print("error");
				c = 1;
				break;
			}
			else
			{
				if (a.charAt(i) == b.charAt(i))
				{
				   x++;
				}
			}
			y++;

		}
		if (c == 0)
		{
		if (b.charAt(i) != '\0')
		{
			System.out.print("error");
			c = 1;
		}
		}

		if (c == 0)
		{
			if ((x / y) > n)
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

