package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int r1;
		int r2;
		int num = 0;
		int index = 0;
		double n;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
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
		r1 = a.length();
		r2 = b.length();
		for (i = 0;i < r1;i++)
		{
			if (a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G')
			{
				continue;
			}
			else
			{
				index = 1;
				break;
			}
		}
		for (i = 0;i < r2;i++)
		{
			if (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G')
			{
				continue;
			}
			else
			{
				index = 1;
				break;
			}
		}
		if (r1 != r2 || index == 1)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < r1;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					num++;
				}
			}
			if ((num * 1.0 / r1) >= n)
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

