package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double b;
	String x = new String(new char[1000]);
	String y = new String(new char[1000]);
	int i;
	int t;
	int a1;
	int a2;
	int p1;
	int p2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		b = Double.parseDouble(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		y = tempVar3.charAt(0);
	}
	t = 0;
	a1 = 0;
	a2 = 0;
	p1 = 0;
	p2 = 0;
	for (i = 0;x.charAt(i) != 0;i++)
	{
	a1++;
	if (x.charAt(i) != 'G' && x.charAt(i) != 'C' && x.charAt(i) != 'T' && x.charAt(i) != 'A')
	{
		p1++;
	}
	}
	for (i = 0;y.charAt(i) != 0;i++)
	{
	a2++;
	if (y.charAt(i) != 'G' && y.charAt(i) != 'C' && y.charAt(i) != 'T' && y.charAt(i) != 'A')
	{
		p2++;
	}
	}
	if (p1 > 0 || p2 > 0 || a1 != a2)
	{
		System.out.print("error");
	}
	else
	{
	  for (i = 0;y.charAt(i) != 0;i++)
	  {
	   if (x.charAt(i) == y.charAt(i))
	   {
		   t++;
	   }
	  }
	if (1.0 * t / a1 > b)
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

