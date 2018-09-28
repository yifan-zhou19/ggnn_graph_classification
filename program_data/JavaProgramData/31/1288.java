public class sd
{
	public String xh = new String(new char[100]);
	public String xm = new String(new char[100]);
	public char xb;
	public int nl;
	public double df;
	public String dz = new String(new char[10]);
	public sd before;
}

package <missing>;

public class GlobalMembers
{
	public static sd cre()
	{
		sd p1;
		sd p2 = null;

	while (true)
	{
		p1 = (sd)(new sd());

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		p1.xh = tempVar.charAt(0);
	}
	if (strcmp(p1.xh,"end") == 0)
	{
		break;
	}
	else
	{
		p1.before = p2;
		p2 = p1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.xm = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p1.xb = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.nl = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.df = Double.parseDouble(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.dz = tempVar6.charAt(0);
		}
	}
	}
	return p2;
	}
	public static void Main()
	{
		sd cre = new sd();
		sd p = cre();
		while (true)
		{
			System.out.printf("%s %s %c %d %g %s\n",p.xh,p.xm,p.xb,p.nl,p.df,p.dz);
	if (p.before == null)
	{
		break;
	}
	else
	{
		p = p.before;
	}
		}
	}

}

