package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Double.parseDouble(tempVar);
		}
		String a = new String(new char[500]);
		String b = new String(new char[500]);
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
		int ci = 0;
		int pan = 0;
		int aa = a.length();
		int bb = b.length();
		if (aa != bb)
		{
			System.out.print("error");
		}
		else
		{
			int i;
			for (i = 0;i < aa;i++)
			{
				if ((a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C') || (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C'))
				{
					System.out.print("error");
					pan = 1;
					break;
				}
				else
				{
					if (a.charAt(i) == b.charAt(i))
					{
					ci++;
					}
				}
			}
		   double bi = (double)ci / aa;
		  if (pan == 0)
		  {
			if (bi >= m)
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

