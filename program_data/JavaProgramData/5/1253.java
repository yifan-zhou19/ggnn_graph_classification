package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		String zzd = new String(new char[600]);
		String hzy = new String(new char[600]);
		int i;
		int a;
		double v;
		a = 0;
		double b;
		int c;
		c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zzd = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			hzy = tempVar3.charAt(0);
		}
		b = zzd.length();
		for (i = 0;i < b;i++)
		{
			if (zzd.charAt(i) != 'A' && zzd.charAt(i) != 'G' && zzd.charAt(i) != 'C' && zzd.charAt(i) != 'T')
			{
				System.out.print("error");
				c++;
				break;
			}
			else if (hzy.charAt(i) != 'A' && hzy.charAt(i) != 'G' && hzy.charAt(i) != 'C' && hzy.charAt(i) != 'T')
			{
				System.out.print("error");
				c++;
				break;
			}
			else if (zzd.charAt(i) == hzy.charAt(i))
			{
					a++;
			}
		}
		if (c == 0)
		{
		v = a / b;
		if (v >= n)
		{
			System.out.print("yes");
		}
		else if (v < n)
		{
			System.out.print("no");
		}
		}
		return 0;
	}
}

