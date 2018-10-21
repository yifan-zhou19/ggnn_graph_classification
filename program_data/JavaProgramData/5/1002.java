package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b = 0;
		double n;
		double k;
		String l1 = new String(new char[500]);
		String l2 = new String(new char[500]);
		a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			l1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			l2 = tempVar3.charAt(0);
		}
		for (i = 0;i < l1.length();i++)
		{
				if (l1.charAt(i) < 'A' || l1.charAt(i)>'Z' || l2.charAt(i) < 'A' || l2.charAt(i)>'Z')
				{
					b = 1;
				}
		}
		if (l1.length() != l2.length() || b == 1)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < l1.length();i++)
			{
				if (l1.charAt(i) == l2.charAt(i))
				{
					a++;
				}
			}
			k = 1.0 * a / l1.length();
			if (k > n)
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

