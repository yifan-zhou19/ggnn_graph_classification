package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		int sum = 0;
		int i;
		int lena;
		int lenb;
		int t = 0;
		double n;
		double bi;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
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
		lena = a.length();
		lenb = b.length();
		for (i = 0;i < lena;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'G' && a.charAt(i) != 'C' && a.charAt(i) != 'T')
			{
				t++;
			}
		}
		for (i = 0;i < lenb;i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'G' && b.charAt(i) != 'C' && b.charAt(i) != 'T')
			{
				t++;
			}
		}

		if (lena != lenb || t != 0)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0;i < lena;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
					sum++;
				}
			}
			bi = (double)sum / lena;
			if (bi > n)
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

