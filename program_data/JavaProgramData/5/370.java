package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int e1;
		int e2;
		int t;
		t = 1;
		k = 0;
		double bl1;
		double bl2;
		String jy1 = new String(new char[501]);
		String jy2 = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			bl1 = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			jy1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			jy2 = tempVar3.charAt(0);
		}
		e1 = jy1.length();
		e2 = jy2.length();
		if (e1 != e2)
		{
			t = 0;
		}
		else
		{
			for (i = 0;i < e1;i++)
			{
				if ((jy1.charAt(i) != 'A' && jy1.charAt(i) != 'T' && jy1.charAt(i) != 'C' && jy1.charAt(i) != 'G') || (jy2.charAt(i) != 'A' && jy2.charAt(i) != 'T' && jy2.charAt(i) != 'C' && jy2.charAt(i) != 'G'))
				{
					t = 0;
					break;
				}
				else
				{
					if (jy1.charAt(i) == jy2.charAt(i))
					{
						k = k + 1;
					}
				}
			}
		}
		bl2 = 1.0 * k / e1;
		if (t == 0)
		{
			System.out.print("error");
		}
		else
		{
			if (bl2 > bl1)
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

