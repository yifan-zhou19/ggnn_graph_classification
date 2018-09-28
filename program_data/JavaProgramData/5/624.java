package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double p;
		double q;
		int a;
		int b;
		int m = 0;
		int brak = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Double.parseDouble(tempVar);
		}
		String k = new String(new char[600]);
		String kk = new String(new char[600]);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			kk = tempVar3.charAt(0);
		}
		a = k.length();
		b = kk.length();
		for (int h = 0;;h++)
		{
			if (a != b)
			{
			System.out.print("error");
			break;
			}
			for (int c = 0;c < a;c++)
			{
				if (!(k.charAt(c) == 'A' || k.charAt(c) == 'T' || k.charAt(c) == 'C' || k.charAt(c) == 'G'))
				{
					brak++;
				}
				if (!(kk.charAt(c) == 'A' || kk.charAt(c) == 'T' || kk.charAt(c) == 'C' || kk.charAt(c) == 'G'))
				{
					brak++;
				}
			}
			if (brak != 0)
			{
				System.out.print("error");
				break;
			}
			for (int i = 0;i < a;i++)
			{
				if (k.charAt(i) == kk.charAt(i))
				{
					m++;
				}
			}
			q = m / (a * 1.0);
			if (q >= p)
			{
				System.out.print("yes");
			}
			if (q < p)
			{
				System.out.print("no");
			}
			break;
		}
		return 0;
	}

}

