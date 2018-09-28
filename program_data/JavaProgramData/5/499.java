package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String k = new String(new char[501]);
		String h = new String(new char[501]);
		double c;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			h = tempVar3.charAt(0);
		}
		int sum = 0;
		int a;
		a = k.length();
		int b;
		b = h.length();
		if (a != b)
		{
			System.out.print("error");
		}
		else if (a == b)
		{
			for (int i = 0;i < a;i++)
			{
				if ((k.charAt(i) != 'A' && k.charAt(i) != 'T' && k.charAt(i) != 'C' && k.charAt(i) != 'G') || (h.charAt(i) != 'A' && h.charAt(i) != 'T' && h.charAt(i) != 'C' && h.charAt(i) != 'G'))
				{
					System.out.print("error");
				return 0;
				}
				else
				{
					if (k.charAt(i) == h.charAt(i))
					{
						sum++;
					}
				}
			}
			if (1.0 * sum / a > c)
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

