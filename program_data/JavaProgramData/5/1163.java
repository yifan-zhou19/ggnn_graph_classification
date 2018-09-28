package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		double s = 0;
		String a = new String(new char[502]);
		String b = new String(new char[502]);
		int len1;
		int len2;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		len1 = a.length();
		len2 = b.length();
		if (len1 != len2)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < len1;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < len2;i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T')
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < len1;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				s++;
			}
		}
		s = s / len1;
		if (s > x)
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

