package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int k;
		int sum = 0;
		int i;
		int t = 0;
		double x;
		double y;
		String jz = new String(new char[500]);
		String a = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			jz = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a = tempVar3.charAt(0);
		}
		len = jz.length();
		k = a.length();
		if (k != len)
		{
			System.out.print("error");
		}
		else
		{
		for (i = 0;i < len;i++)
		{
			if (jz.charAt(i) != 'T' && jz.charAt(i) != 'A' && jz.charAt(i) != 'C' && jz.charAt(i) != 'G' && a.charAt(i) != 'T' && a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
			{
				System.out.print("error");
				t = 1;
				break;
			}
				if (jz.charAt(i) == a.charAt(i))
				{
				sum++;
				}

		}
		y = 1.0 * sum / len;
		if (t == 0)
		{
		if (y >= x)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}
		}
		}
		return 0;
	}
}

