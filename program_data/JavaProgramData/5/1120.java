package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k = 0;
		int l;
		int m;
		int n;
		double s;
		double z;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Double.parseDouble(tempVar);
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
		l = a.length();
		j = b.length();
		if (l != j)
		{
			System.out.print("error\n");
			return 0;
		}
		for (i = 0;i < l;i++)
		{
			if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G'))
			{
				System.out.print("error\n");
				return 0;
			}
			if (a.charAt(i) == b.charAt(i))
			{
				k++;
			}
		}
		z = (double)k / l;
		if (z >= s)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;
	}


}

