package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		String a = new String(new char[500]);
		String b = new String(new char[500]);

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

		int i;
		int x;
		x = 0;

		double w;
		double k;
		double j;
		double l;

		k = a.length();
		l = b.length();

		if (k == l)
		{
			for (i = 0;i < k;i++)
			{
				if (a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'C' || a.charAt(i) == 'G')
				{
					x = 1;
				}
				else
				{
					x = 0;
					break;
				}
				if (b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'C' || b.charAt(i) == 'G')
				{
					x = 1;
				}
				else
				{
					x = 0;
					break;
				}
			}
			if (x == 1)
			{
		 w = 0;

		for (i = 0;i < k;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				w = w + 1;
			}
		}



		j = w / k;

		if (j <= n)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
			}
			else
			{
				System.out.print("error");
			}
		}

		else
		{
			System.out.print("error");
		}

		return 0;
	}


}

