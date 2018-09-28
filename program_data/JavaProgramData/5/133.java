package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int i;
		int k;
		int l = 0;
		k = 0;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			d = Double.parseDouble(tempVar);
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
		if (a.length() != b.length())
		{
			k = 1;
			System.out.print("error");
		}
		if (a.length() == b.length())
		{
			for (i = 0;i < a.length();i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					l++;
				}
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
				{
					k = 1;
					System.out.print("error");
					break;
				}
			}
		}
		if (k == 0)
		{
			if ((1.0 * l / a.length()) >= d)
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

