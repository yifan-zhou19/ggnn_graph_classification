package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l1;
		int l2;
		float s;
		float w;
		float L;
		String x = new String(new char[501]);
		String y = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Float.parseFloat(tempVar);
		}
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
		s = 0F;
		l1 = x.length();
		l2 = y.length();
		if (l1 != l2)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < l1;i++)
			{
				if (x.charAt(i) != 'A' && x.charAt(i) != 'T' && x.charAt(i) != 'C' && x.charAt(i) != 'G')
				{
					System.out.print("error");
					break;
				}
				if (y.charAt(i) != 'A' && y.charAt(i) != 'T' && y.charAt(i) != 'C' && y.charAt(i) != 'G')
				{
					System.out.print("error");
					break;
				}
				else
				{
					if (x.charAt(i) == y.charAt(i))
					{
						s++;
					}
				}
			}
			L = l1;
			if (i == l1)
			{
				if (s / L > w)
				{
					System.out.print("yes");
				}
				else
				{
					System.out.print("no");
				}
			}
		}
		return 0;
	}


}

