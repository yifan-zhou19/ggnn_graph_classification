package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double z;
		String sz1 = new String(new char[500]);
		String sz2 = new String(new char[500]);
		int i;
		int m;
		int n;
		int x = 1;
		int y = 0;
		double e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			z = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz2 = tempVar3.charAt(0);
		}
		m = sz1.length();
		n = sz2.length();
		for (i = 0;sz1.charAt(i) != '\0';i++)
		{
			if (sz1.charAt(i) == 'A' || sz1.charAt(i) == 'G' || sz1.charAt(i) == 'C' || sz1.charAt(i) == 'T')
			{
			continue;
			}
	else if (sz1.charAt(i) != 'A' || sz1.charAt(i) != 'G' || sz1.charAt(i) != 'C' || sz1.charAt(i) != 'T')
	{
	x = 0;
	break;
	}
		}
		 if ((m != n) || (x == 0))
		 {
		System.out.print("error");
		 }
		else if (m == n && x == 1)
		{
			for (i = 0;sz1.charAt(i) != '\0';i++)
			{
				if (sz1.charAt(i) == sz2.charAt(i))
				{
				y++;
				}
			}
			e = 1.0 * y / m;
			if (e > z)
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

