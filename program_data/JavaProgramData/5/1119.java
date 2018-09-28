package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String w1 = new String(new char[501]);
		String w2 = new String(new char[501]);
		int len1;
		int len2;
		int i;
		int a = 0;
		int b = 0;
		double n;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			w2 = tempVar3.charAt(0);
		}
		len1 = w1.length();
		len2 = w2.length();
		if (len1 != len2)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < len1 - 1;i++)
			{
				if ((w1.charAt(i) != 'A' && w1.charAt(i) != 'T' && w1.charAt(i) != 'G' && w1.charAt(i) != 'C') || (w2.charAt(i) != 'A' && w2.charAt(i) != 'T' && w2.charAt(i) != 'G' && w2.charAt(i) != 'C'))
				{
				   b = 1;
				   System.out.print("error");
				   break;
				}
			}
			for (i = 0;i < len1;i++)
			{
				if (w1.charAt(i) - w2.charAt(i) == 0)
				{
					a++;
				}
			}
			m = 1.0 * a / (len1 - 1);
			if (m > n && b == 0)
			{
				System.out.print("yes");
			}
			if (m < n && b == 0)
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

