package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double s;
		String sz1 = new String(new char[500]);
		String sz2 = new String(new char[500]);
		int i;
		int n = 0;
		int len1;
		int len2;
		double num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz2 = tempVar3.charAt(0);
		}
		len1 = sz1.length();
		len2 = sz2.length();
		if (len1 != len2)
		{
			System.out.print("error");
			return 0;
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				if ((sz1.charAt(i) != 'A' && sz1.charAt(i) != 'T' && sz1.charAt(i) != 'C' && sz1.charAt(i) != 'G') || (sz2.charAt(i) != 'A' && sz2.charAt(i) != 'T' && sz2.charAt(i) != 'C' && sz2.charAt(i) != 'G'))
				{
					System.out.print("error");
					return 0;
				}
			}
			for (i = 0;i < len1;i++)
			{
				if (sz1.charAt(i) == sz2.charAt(i))
				{
					n++;
				}
			}
			num = 1.0 * n / len1;
			if (num > s)
			{
				System.out.print("yes");
				return 0;
			}
			else
			{
				System.out.print("no");
				return 0;
			}
		}
	}
}

