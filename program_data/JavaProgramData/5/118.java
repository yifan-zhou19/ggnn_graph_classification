package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double m;
		double aver;
		int n;
		int i;
		int j;
		int k = 0;
		int l = 0;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
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
			k++;
		}
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G' && b.charAt(i) != 'A' && b.charAt(i) != 'C' && b.charAt(i) != 'T' && b.charAt(i) != 'G')
			{
			k++;
			}
		}
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				l++;
			}

		}
		aver = 1.0 * l / a.length();
		if (k != 0)
		{
			System.out.print("error");
		}
		if (k == 0)
		{
			if (aver > m)
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

