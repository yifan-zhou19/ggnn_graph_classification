package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String f = new String(new char[501]);
		String t = new String(new char[501]);
		int i;
		double j = 0;
		double r = 0;
		double s = 0;
		double n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			f = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = tempVar3.charAt(0);
		}
		for (i = 0;f.charAt(i) != '\0';i++)
		{
			j++;
		}
		for (i = 0;t.charAt(i) != '\0';i++)
		{
			r++;
		}
		if (j != r)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;f.charAt(i) != '\0';i++)
		{
			if (f.charAt(i) != 'A' && f.charAt(i) != 'T' && f.charAt(i) != 'C' && f.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
			if (t.charAt(i) != 'A' && t.charAt(i) != 'T' && t.charAt(i) != 'C' && t.charAt(i) != 'G')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;f.charAt(i) != '\0';i++)
		{
			if (f.charAt(i) == t.charAt(i))
			{
			s++;
			}
		}
		if (s / j > n)
		{
			System.out.print("yes");
		}
		if (s / j <= n)
		{
			System.out.print("no");
		}

		return 0;
	}


}

