package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double x;
		int m;
		int n;
		int i;
			 int p = 0;
			 int s = 0;
			 int[] c = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Double.parseDouble(tempVar);
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
		m = a.length();
		n = b.length();
		if (m != n)
		{
		  System.out.print("error");
			   return 0;
		}
		for (i = 0;i < m - 1;i++)
		{
			if ((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'G') && (a.charAt(i) != 'C'))
			{
			   System.out.print("error");
						 s = 1;
			   break;
						 return 0;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			if ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'G') && (b.charAt(i) != 'C'))
			{
			   System.out.print("error");
			   s = 1;
						 break;
						 return 0;
			}
		}
			if (s == 0)
			{
			  for (i = 0;i < n;i++)
			  {
				 c[i] = a.charAt(i) / b.charAt(i);
			  }
			for (i = 0;i < m;i++)
			{
				if (c[i] < x)
				{
				p++;
				}
			}
			if (p == 0)
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

