package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double p;
		int i;
		int k = 0;
		int s = 0;
		String zfc1 = new String(new char[500]);
		String zfc2 = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			zfc2 = tempVar3.charAt(0);
		}
		int a = zfc1.length();
		int b = zfc2.length();
		if (a != b)
		{
			System.out.print("error");
		}
		  else
		  {
			  for (i = 0;i < a;i++)
			  {
			  if ((zfc1.charAt(i) == 'A' || zfc1.charAt(i) == 'T' || zfc1.charAt(i) == 'C' || zfc1.charAt(i) == 'G') && (zfc2.charAt(i) == 'A' || zfc2.charAt(i) == 'T' || zfc2.charAt(i) == 'C' || zfc2.charAt(i) == 'G'))
			  {
		  s++;
			  }
		  if (zfc1.charAt(i) == zfc2.charAt(i))
		  {
					k++;
		  }
			  }
		if (s == a)
		{
			p = 1.0 * k / a;
			if (p > n)
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

		  }
	return 0;
	}


}

