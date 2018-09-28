package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float rate;
		int i;
		int lena;
		int lenb;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Float.parseFloat(tempVar);
		}
		String an = new String(new char[501]);
		String bn = new String(new char[501]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			an = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			bn = tempVar3.charAt(0);
		}
		lena = an.length();
		lenb = bn.length();
		if (lena != lenb)
		{
			System.out.print("error");
			return 0;
		}
		for (i = 0;i < lena;i++)
		{
			if ((an.charAt(i) != 'A' && an.charAt(i) != 'T' && an.charAt(i) != 'C' && an.charAt(i) != 'G') || (bn.charAt(i) != 'A' && bn.charAt(i) != 'T' && bn.charAt(i) != 'C' && bn.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < lena;i++)
		{
			if (an.charAt(i) == bn.charAt(i))
			{
				sum += 1;
			}
		}
		rate = 1.0 * sum / lena;
		if (rate > a)
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

