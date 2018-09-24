package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a = 0;
		int j;
		int c;
		int b;
		double n;
		String sz1 = new String(new char[1000]);
		String sz2 = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
		for (i = 0;sz1.charAt(i) != '\0';i++)
		{
			c = i;
		}
		for (j = 0;sz2.charAt(j) != '\0';j++)
		{
			b = j;
		}
		if (c != b)
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			for (i = 0;sz1.charAt(i) != '\0';i++)
			{
				if ((sz1.charAt(i) != 'A' && sz1.charAt(i) != 'C' && sz1.charAt(i) != 'G' && sz1.charAt(i) != 'T') || (sz2.charAt(i) != 'C' && sz2.charAt(i) != 'A' && sz2.charAt(i) != 'G' && sz2.charAt(i) != 'T'))
				{
					System.out.print("error");
					return 0;
				}
			}
			for (j = 0;sz1.charAt(j) != '\0';j++)
			{
				if (sz1.charAt(j) == sz2.charAt(j) && (sz1.charAt(j) == 'A' || sz1.charAt(j) == 'C' || sz1.charAt(j) == 'G' || sz1.charAt(j) == 'T') && (sz2.charAt(j) == 'C' || sz2.charAt(j) == 'A' || sz2.charAt(j) == 'G' || sz2.charAt(j) == 'T'))
				{
					a++;
				}
			}
		}
		if (1.0 * a / (c + 1) > n)
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

