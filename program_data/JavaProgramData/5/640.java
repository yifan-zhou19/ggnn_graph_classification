package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int c;
		int i;
		int j;
		int count;
		double a;
		double x;
		double y;
		double z;
		String m = new String(new char[550]);
		String n = new String(new char[550]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead("\n");
		if (tempVar2 != null)
		{
			m = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			n = tempVar3.charAt(0);
		}
		b = m.length();
		c = n.length();
		if (b != c)
		{
			System.out.print("error");
		}
		j = 0;
		if (b == c)
		{
			for (i = 0;m.charAt(i) != '\0';i++)
			{
				if (m.charAt(i) != 'A' && m.charAt(i) != 'T' && m.charAt(i) != 'C' && m.charAt(i) != 'G')
				{
					j++;
				}
			}
			for (i = 0;n.charAt(i) != '\0';i++)
			{
				if (n.charAt(i) != 'A' && n.charAt(i) != 'T' && n.charAt(i) != 'C' && n.charAt(i) != 'G')
				{
					j++;
				}
			}
			if (j > 0)
			{
				System.out.print("error");
			}
		}
		count = 0;
		if (b == c && j == 0)
		{
			for (i = 0;m.charAt(i) != '\0';i++)
			{
				if (m.charAt(i) == n.charAt(i))
				{
					count++;
				}
			}
			y = count;
			z = b;
			x = z * a;
			if (y >= x)
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

