public class stu
{
	public String xuehao = new String(new char[20]);
	public String xingming = new String(new char[30]);
	public char xingbie;
	public int nianling;
	public String defen = new String(new char[10]);
	public String dizhi = new String(new char[20]);
	public stu last;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(10000);
	stu p;
	int i = 0;
	a[0].last = null;
	for (;;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i].xuehao = tempVar.charAt(0);
	}
	if (a[i].xuehao.charAt(0) == 'e')
	{
	break;
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i].xingming = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar3 != null)
	{
		a[i].xingbie = tempVar3.charAt(0);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		a[i].nianling = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		a[i].defen = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		a[i].dizhi = tempVar6.charAt(0);
	}
	if (i > 0)
	{
	a[i].last = a + i - 1;
	}
	p = (a + i);
	}

	while (p != null)
	{
	System.out.printf("%s %s %c %d %s %s\n",p.xuehao,p.xingming,p.xingbie,p.nianling,p.defen,p.dizhi);
	p = p.last;
	}
	}
}

