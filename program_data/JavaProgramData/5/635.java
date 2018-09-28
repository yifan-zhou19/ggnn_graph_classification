package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float x;
		float y;
		float k = 0F;
		int i;
		int j;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Float.parseFloat(tempVar);
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
		for (i = 0;a.charAt(i);i++)
		{
			if (!(a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'G' || a.charAt(i) == 'C'))
			{
				System.out.print("error\n");
				return 0;
			}
		}
		for (j = 0;b.charAt(j);j++)
		{
			if (!(b.charAt(j) == 'A' || b.charAt(j) == 'T' || b.charAt(j) == 'G' || b.charAt(j) == 'C'))
			{
				System.out.print("error\n");
				return 0;
			}
		}
		if (i != j)
		{
			System.out.print("error\n");
			return 0;
		}
		for (i = 0;a.charAt(i);i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				k += 1;
			}
		}
		y = k / j;
		if (y > x)
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

