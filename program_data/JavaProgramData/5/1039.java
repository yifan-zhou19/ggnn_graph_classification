package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
		}
		String qian = new String(new char[501]);
		String hou = new String(new char[501]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			qian = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			hou = tempVar3.charAt(0);
		}

		int i;
		int s = 0;
		if (qian.length() != hou.length())
		{
			s = 1;
		}
		int m = 0;
		for (i = 0;i < qian.length();i++)
		{
			if ((qian.charAt(i) != 'A' && qian.charAt(i) != 'T' && qian.charAt(i) != 'G' && qian.charAt(i) != 'C') || (hou.charAt(i) != 'A' && hou.charAt(i) != 'T' && hou.charAt(i) != 'G' && hou.charAt(i) != 'C'))
			{
				s = 1;
			}
		}
		if (s == 1)
		{
			System.out.print("error");
		}
		else if (s == 0)
		{
			for (i = 0;i < qian.length();i++)
			{
				if (qian.charAt(i) == hou.charAt(i))
				{
					m++;
				}
			}
			if (1.0 * m / qian.length() > k)
			{
				System.out.print("yes");
			}
			else if (1.0 * m / qian.length() <= k)
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

