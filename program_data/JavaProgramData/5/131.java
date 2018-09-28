package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[number]);
		String d = new String(new char[number]);
		char tmp;
		int i;
		int m;
		int n;
		int j;
		int mc;
		double k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = tempVar3.charAt(0);
		}
		m = a.length();
		n = d.length();
		if (m != n)
		{
			System.out.print("error");
		}
		else
		{
			j = 0;
			for (i = 0;i < m;i++)
			{
				if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
				{
					mc = 1;
					break;
				}
				else if (d.charAt(i) != 'A' && d.charAt(i) != 'T' && d.charAt(i) != 'C' && d.charAt(i) != 'G')
				{
					mc = 1;
					break;
				}
				else
				{
					mc = 0;
				}
				if (a.charAt(i) == d.charAt(i))
				{
					j++;
				}
			}
			if (mc == 1)
			{
				System.out.print("error");
			}
			else if (j < (k * m))
			{
				System.out.print("no");
			}
			else if (j >= (k * m))
			{
				System.out.print("yes");
			}
		}
		return 0;
	}
}

