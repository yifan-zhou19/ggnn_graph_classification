package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		int m;
		int k = 0;
		int p = 1;
		double n;
		String str = new String(new char[500]);
		String tw = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			tw = tempVar3.charAt(0);
		}
		l = str.length();
		m = tw.length();
		if (l != m)
		{
			p = 0;
		}
		for (i = 0;i < l;i++)
		{
			if ((str.charAt(i) != 'A' && str.charAt(i) != 'T' && str.charAt(i) != 'C' && str.charAt(i) != 'G') || (tw.charAt(i) != 'A' && tw.charAt(i) != 'T' && tw.charAt(i) != 'C' && tw.charAt(i) != 'G'))
			{
			 p = 0;
			 break;
			}
		}
	if (p == 1)
	{
			 for (i = 0;i < l;i++)
			 {
				 if (str.charAt(i) == tw.charAt(i))
				 {
					 k++;
				 }
			 }
			 if (1.0 * k / l >= n)
			 {
				 System.out.print("yes");
			 }
			 else
			 {
				 System.out.print("no");
			 }
	}
	else
	{
		System.out.print("error");
	}
	return 0;
	}

}

