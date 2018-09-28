package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int q = 1;
		double s = 0.0;
		double len;
		double res;
		double req;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			req = Double.parseDouble(tempVar);
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
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'G' && a.charAt(i) != 'C')
			{
				q = 0;
			}
			if (b.charAt(i) != 'A' && b.charAt(i) != 'T' && b.charAt(i) != 'G' && b.charAt(i) != 'C')
			{
				q = 0;
			}
		}
		if (q == 0)
		{
			System.out.print("error\n");
		}
		else if (q != 0)
		{
			for (i = 0;i < len;i++)
			{
			  if (a.charAt(i) == b.charAt(i))
			  {
				s++;
			  }
			}
		res = s / len * 1.0;
		if (req < res)
		{
		System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
		}
			return 0;
	}
}

