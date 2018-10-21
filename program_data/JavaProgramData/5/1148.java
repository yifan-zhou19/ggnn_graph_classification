package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double s;
		double w;
		int k1 = 0;
		int k2 = 0;
		int i;
		int dian;
		int lena;
		int lenb;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);


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
		lena = a.length();
		lenb = b.length();


		for (i = 0;i < lena;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			{

				k1 = 1;
			}
		}
		for (i = 0;i < lenb;i++)
		{
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'C' && b.charAt(i) != 'G')
			{

				k2 = 1;
			}
		}

		if (k1 == 1 || k2 == 1 || lena != lenb)
		{
			System.out.print("error");
		}
		else
		{
			for (i = 0,dian = 0;i < lena;i++)
			{
				if (a.charAt(i) == b.charAt(i))
				{
				dian++;
				}

			}

			w = 1.0 * dian / lena;
			if (w >= s)
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

