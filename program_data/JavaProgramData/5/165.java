package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		float l1;
		float l2;
		float n;
		float count = 0F;
		float result;
		String x = new String(new char[505]);
		String y = new String(new char[505]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
		}
		System.in.read();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = tempVar3.charAt(0);
		}
		l1 = x.length();
		l2 = y.length();
		if (l1 != l2)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < l1;i++)
		{
			if (x.charAt(i) == 'A' || x.charAt(i) == 'T' || x.charAt(i) == 'C' || x.charAt(i) == 'G')
			{
				continue;
			}
			else
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < l2;i++)
		{
			if (y.charAt(i) == 'A' || y.charAt(i) == 'T' || y.charAt(i) == 'C' || y.charAt(i) == 'G')
			{
				continue;
			}
			else
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < l1;i++)
		{
			if (x.charAt(i) == y.charAt(i))
			{
				count++;
			}
		}
		result = count / l1;
		if (result > n)
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

