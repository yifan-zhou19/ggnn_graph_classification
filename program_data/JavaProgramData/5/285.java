package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int f;
		int i;
		int g;
		int p = 1;
		double x;
		String s = new String(new char[501]);
		String t = new String(new char[501]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = tempVar3.charAt(0);
		}
		f = s.length();
		g = t.length();
		if (f != g)
		{
			p = 0;
		}
		else
		{
			for (i = 0;i < f;i++)
			{
				if ((s.charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'G' && s.charAt(i) != 'C') || (t.charAt(i) != 'A' && t.charAt(i) != 'T' && t.charAt(i) != 'G' && t.charAt(i) != 'C'))
				{
				p = 0;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("error");
		}
		else
		{
		  for (i = 0;i < f;i++)
		  {
			if (t.charAt(i) == s.charAt(i))
			{
				m++;
			}
		  }
		  if (1.0 * m / f > x)
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

