package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x;
		int y;
		int count = 0;
		double n;
		double m;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
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
		for (i = 0;a.charAt(i) != '\0',b.charAt(i) != '\0';i++)
		{
			x = a.length();
			y = b.length();
			if (x != y)
			{
				System.out.print("error\n");

				return 0;
				break;
			}
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if (a.charAt(j) != 'A' && a.charAt(j) != 'T' && a.charAt(j) != 'G' && a.charAt(j) != 'C')
				{
					System.out.print("error\n");

					return 0;
						break;
				}
				if (b.charAt(j) != 'A' && b.charAt(j) != 'T' && b.charAt(j) != 'G' && b.charAt(j) != 'C')
				{
					System.out.print("error\n");

					return 0;
						break;
				}
			}

			if (a.charAt(i) == b.charAt(i))
			{
				count++;
			}
		}
			m = ((1.0) * count) / x;
			if (m >= n)
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

