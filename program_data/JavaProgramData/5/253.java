package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double e;
		double s;
		String a = new String(new char[N]);
		String b = new String(new char[N]);
		int l1;
		int l2;
		int i;
		int j;
		int t;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			e = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}

		l1 = a.length();
		l2 = b.length();

		for (i = 0;i < l1;i++)
		{
			if (a.charAt(i) != 'A' && a.charAt(i) != 'T' && a.charAt(i) != 'C' && a.charAt(i) != 'G')
			{
			  System.out.print("error\n");
			  return 0;
			}
		}

		for (j = 0;j < l2;j++)
		{
			if (b.charAt(j) != 'A' && b.charAt(j) != 'T' && b.charAt(j) != 'C' && b.charAt(j) != 'G')
			{
			  System.out.print("error\n");
			  return 0;
			}
		}

		if (l1 != l2)
		{
		  System.out.print("error\n");
		}

		else if (l1 == l2)
		{
		  t = 0;
		  for (i = 0;i < l1;i++)
		  {
			  if (a.charAt(i) == b.charAt(i))
			  {
			   t++;
			  }
		  }
		  s = 1.0 * t / l1;
		  if (s > e)
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

