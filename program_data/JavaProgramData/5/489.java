package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double rate;
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			rate = Double.parseDouble(tempVar);
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
		int lena;
		int lenb;
		lena = a.length();
		lenb = b.length();
		int sum = 0;
		int zq = 0;
		if (lena == lenb)
		{
			int i;


			for (i = 0;i < lena;i++)
			{
				if (a.charAt(i) == 'A' || a.charAt(i) == 'T' || a.charAt(i) == 'G' || a.charAt(i) == 'C' || b.charAt(i) == 'A' || b.charAt(i) == 'T' || b.charAt(i) == 'G' || b.charAt(i) == 'C')
				{
					if (a.charAt(i) == b.charAt(i))
					{
						sum++;
					}
					zq++;


				}
				else
				{
					System.out.print("error");
					break;
				}
			}
		}
		else
		{
			System.out.print("error");
		}
		double r;
		r = 1.0 * sum / lena;
		if (zq == lena)
		{
			if (r > rate)
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

