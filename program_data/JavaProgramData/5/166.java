package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double dz;
		String xl1 = new String(new char[500]);
		String xl2 = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			dz = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			xl1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead("\n");
		if (tempVar3 != null)
		{
			xl2 = tempVar3.charAt(0);
		}
		int len1;
		int len2;
		len1 = xl1.length();
		len2 = xl2.length();
		int e = 0;
		if (len1 != len2)
		{
			System.out.print("error");
			e++;
		}
		int i;
		if (e == 0)
		{
			for (i = 0;i < len1;i++)
			{
				if ((xl1.charAt(i) != 'A' && xl1.charAt(i) != 'T' && xl1.charAt(i) != 'C' && xl1.charAt(i) != 'G') || (xl2.charAt(i) != 'A' && xl2.charAt(i) != 'T' && xl2.charAt(i) != 'C' && xl2.charAt(i) != 'G'))
				{
				e++;
				}
			}
			if (e != 0)
			{
				System.out.print("error");
			}
		}
		int sum = 0;
		if (e == 0)
		{
			for (i = 0;i < len1;i++)
			{
				if (xl1.charAt(i) == xl2.charAt(i))
				{
					sum++;
				}
			}
			if (1.0 * sum / len1 > dz)
			{
				System.out.print("yes");
			}
			else
			{
				System.out.print("no");
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			e = Integer.parseInt(tempVar4);
		}
		return 0;
	}
}

