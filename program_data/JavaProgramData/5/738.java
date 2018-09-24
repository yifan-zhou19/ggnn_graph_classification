package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double j = 0;
		double m;
		double k = 0;
		double l = 0;
		int o = 0;
		int i;
		String b = new String(new char[500]);
		String c = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			k++;
		}
			for (i = 0;c.charAt(i) != '\0';i++)
			{
			l++;
			}
			for (i = 0;b.charAt(i) != '\0';i++)
			{
			if (b.charAt(i) == c.charAt(i))
			{
				j++;
			}
			}
		m = j / k;
			for (i = 0;b.charAt(i) != '\0';i++)
			{
				if ((b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G') || (c.charAt(i) != 'A' && c.charAt(i) != 'T' && c.charAt(i) != 'C' && c.charAt(i) != 'G'))
				{
					o++;
				}
			}
			if (o > 0 || k != l)
			{
				System.out.print("error");
			}
		else if (m >= a)
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

