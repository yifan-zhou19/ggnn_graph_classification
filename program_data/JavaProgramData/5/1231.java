package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l1;
		int l2;
		int t;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		double n;
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
		l1 = a.length();
		l2 = b.length();
		if (l1 != l2)
		{
			System.out.print("error");
			return 0;
		}
		t = 0;
		for (i = 0;i < l1;i++)
		{
			if ((a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'G' || a.charAt(i) == 'C') && (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'G' || b.charAt(i) == 'C'))
			{
				if (a.charAt(i) == b.charAt(i))
				{
					t++;
				}
			}
			else
			{
				System.out.print("error");
				return 0;
			}
		}
		if (1.0 * t / l1 >= n)
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

