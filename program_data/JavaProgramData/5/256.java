package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double s;
		double t;
		int m;
		int n;
		int flag = 0;
		int e = 0;
		String a = new String(new char[LEN]);
		String b = new String(new char[LEN]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Double.parseDouble(tempVar);
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
		m = a.length();
		n = b.length();
		for (int p = 0;p < m;p++)
		{
			if (a.charAt(p) == 'A' || a.charAt(p) == 'G' || a.charAt(p) == 'C' || a.charAt(p) == 'T')
			{
				flag = 0;
			}
			else
			{
				flag = 1;
				break;
			}
		}
		if ((m != n) || (flag == 1))
		{
			System.out.print("error");
		}
		else
		{
			for (int i = 0;i < n;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					e++;
				}
			}
			t = 1.0 * e / n;
			if (t > s)
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

