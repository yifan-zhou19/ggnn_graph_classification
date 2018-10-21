package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		int i;
		int m;
		int a;
		int o;
		a = 0;
		String ji = new String(new char[1000]);
		String yin = new String(new char[1000]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			ji = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			yin = tempVar3.charAt(0);
		}
		m = ji.length();
		o = yin.length();
		if (m != o)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < m;i++)
		{
			if ((ji.charAt(i) != 'A' && ji.charAt(i) != 'C' && ji.charAt(i) != 'G' && ji.charAt(i) != 'T') || (yin.charAt(i) != 'A' && yin.charAt(i) != 'C' && yin.charAt(i) != 'G' && yin.charAt(i) != 'T'))
			{
				System.out.print("error");
				return 0;
			}
		}
		if (n >= 1)
		{
			System.out.print("no");
			return 0;
		}
		for (i = 0;i < m;i++)
		{
			if (ji.charAt(i) == yin.charAt(i))
			{
				a++;
			}
		}
		b = 1.0 * a / 1.0 * m;
		if (b >= n)
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

