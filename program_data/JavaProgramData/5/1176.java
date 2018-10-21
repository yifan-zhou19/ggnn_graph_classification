package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int js;
		int l;
		String c = new String(new char[600]);
		String d = new String(new char[600]);
		double a;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = tempVar3.charAt(0);
		}
		if (c.length() != d.length())
		{
					  System.out.print("error");
					  return 0;
		}
		l = c.length();
		js = 0;
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			if ((c.charAt(i) == 'A' || c.charAt(i) == 'G' || c.charAt(i) == 'C' || c.charAt(i) == 'T') && (d.charAt(i) == 'A' || d.charAt(i) == 'G' || d.charAt(i) == 'C' || d.charAt(i) == 'T'))
			{
					   if (c.charAt(i) == d.charAt(i))
					   {
					   js++;
					   }
			}
			else
			{
				 System.out.print("error");
					  return 0;
			}
		}
		b = 1.0 * js / l;
		if (b >= a)
		{
		System.out.print("yes");
		}
		else
		{
		System.out.print("no");
		}





		return 0;
	}


}

