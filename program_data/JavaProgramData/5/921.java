package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int l1;
		int l2;
		int l;
		double t;
		double c;
		String a = new String(new char[500]);
		String b = new String(new char[500]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Double.parseDouble(tempVar);
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
		//printf("%lf ",t);
		if (l1 != l2)
		{
			System.out.print("error");
			return 0;
		}
		l = l1;
		for (i = 0;i < l;i++)
		{
			if ((a.charAt(i) != 'A') && (a.charAt(i) != 'T') && (a.charAt(i) != 'C') && (a.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
		}
		for (i = 0;i < l;i++)
		{
			if ((b.charAt(i) != 'A') && (b.charAt(i) != 'T') && (b.charAt(i) != 'C') && (b.charAt(i) != 'G'))
			{
				System.out.print("error");
				return 0;
			}
		}
		for (n = 0,i = 0;i < l;i++)
		{
			if (a.charAt(i) == b.charAt(i))
			{
				n++;
			}
		}
		c = 1.0 * n / l;
		//printf(" %lf %d %d",c,n,l);
		if (c > t)
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

