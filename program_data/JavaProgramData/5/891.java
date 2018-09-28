package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[510]);
		String b = new String(new char[510]);
		int i;
		int c;
		double bl;
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
			b = tempVar3.charAt(0);
		}
		c = 0;
		int len1 = a.length();
		int len2 = b.length();
		if (len1 != len2)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < len1;i++)
			{
				if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
				{
					System.out.print("error");
				return 0;
				}
				else
				{
					if (a.charAt(i) == b.charAt(i))
					{
						c++;
					}
				}
			}
			bl = 1.0 * c / len1;
			if (bl > k)
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

