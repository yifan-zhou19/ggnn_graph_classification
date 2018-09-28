package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		int n;
		int i;
		int m;
		int y;
		String lian1 = new String(new char[LEN]);
		String lian2 = new String(new char[LEN]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			lian1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			lian2 = tempVar3.charAt(0);
		}
		n = lian1.length();
		y = lian2.length();
		if (y != n)
		{
			System.out.print("error");
		return 0;
		}
		for (i = 0;i < n;i++)
		{
			if (!(lian1.charAt(i) == 'A' || lian1.charAt(i) == 'T' || lian1.charAt(i) == 'C' || lian1.charAt(i) == 'G' || lian2.charAt(i) == 'A' || lian2.charAt(i) == 'T' || lian2.charAt(i) == 'C' || lian2.charAt(i) == 'G'))
			{
			   System.out.print("error");
			return 0;
			}
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
			if (lian1.charAt(i) == lian2.charAt(i))
			{
			  m++;
			}
		}
		if (m * 1.0 / n > x)
		{
		  System.out.print("yes");
		}
		else if (m * 1.0 / n <= x)
		{
		  System.out.print("no");
		}




	return 0;


	}

}

