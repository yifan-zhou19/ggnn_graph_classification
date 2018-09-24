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
		int l1;
		int l2;
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
		l1 = a.length();
		l2 = b.length();
		int i;
		int k = 0;
		int flag;
		for (i = 0;i < l1;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T')
			{
				flag = 1;
			}
		}
		for (i = 0;i < l1;i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T')
			{
				flag = 1;
			}
		}
		if (l1 != l2 || flag == 1)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					k++;
				}
			}
			if (1.0 * k / l1 >= n)
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

