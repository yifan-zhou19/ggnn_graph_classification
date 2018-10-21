package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int j;
		double x;
		double y;
		double z;
		double std;
		x = 1.0;
		String aa = new String(new char[1000]);
		String bb = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			std = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			aa = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			bb = tempVar3.charAt(0);
		}
		n = aa.length();
		m = bb.length();
		if (m != n)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < n;i++)
		{
			if ((aa.charAt(i) != 'A') && (aa.charAt(i) != 'T') && (aa.charAt(i) != 'G') && (aa.charAt(i) != 'C') && (bb.charAt(i) != 'A') && (bb.charAt(i) != 'T') && (bb.charAt(i) != 'C') && (bb.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (aa.charAt(i) == bb.charAt(i))
			{
				x = x + 1;
			}
		}
		y = n * 1.0;
		z = x / y;
		if (z > std)
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

