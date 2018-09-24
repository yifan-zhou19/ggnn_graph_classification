public class Student
{
public int id;
public int chn;
public int mth;
public int total;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	Student p1;
	Student top1;
	Student top2;
	Student top3;
	Student temp;
	int i;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	top1 = new Student();
	top2 = new Student();
	top3 = new Student();
	temp = new Student();
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		top1.id = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		top1.chn = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		top1.mth = Integer.parseInt(tempVar4);
	}
	top1.total = top1.chn + top1.mth;
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		top2.id = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		top2.chn = Integer.parseInt(tempVar6);
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		top2.mth = Integer.parseInt(tempVar7);
	}
	top2.total = top2.chn + top2.mth;
	if (top2.total > top1.total)
	{
	temp = top2;
	top2 = top1;
	top1 = temp;
	}
	String tempVar8 = ConsoleInput.scanfRead();
	if (tempVar8 != null)
	{
		top3.id = Integer.parseInt(tempVar8);
	}
	String tempVar9 = ConsoleInput.scanfRead(" ");
	if (tempVar9 != null)
	{
		top3.chn = Integer.parseInt(tempVar9);
	}
	String tempVar10 = ConsoleInput.scanfRead(" ");
	if (tempVar10 != null)
	{
		top3.mth = Integer.parseInt(tempVar10);
	}
	top3.total = top3.chn + top3.mth;
	if (top3.total > top2.total)
	{
	temp = top3;
	top3 = top2;
	top2 = temp;
	}
	if (top2.total > top1.total)
	{
	temp = top2;
	top2 = top1;
	top1 = temp;
	}
	for (i = 3;i < n;i++)
	{
	p1 = new Student();
	String tempVar11 = ConsoleInput.scanfRead();
	if (tempVar11 != null)
	{
		p1.id = Integer.parseInt(tempVar11);
	}
	String tempVar12 = ConsoleInput.scanfRead(" ");
	if (tempVar12 != null)
	{
		p1.chn = Integer.parseInt(tempVar12);
	}
	String tempVar13 = ConsoleInput.scanfRead(" ");
	if (tempVar13 != null)
	{
		p1.mth = Integer.parseInt(tempVar13);
	}
	p1.total = p1.chn + p1.mth;
	if (top1.total < p1.total)
	{
		top3 = top2;
		top2 = top1;
		top1 = p1;
		continue;
	}
	if (top2.total < p1.total)
	{
		top3 = top2;
		top2 = p1;
		continue;
	}
	if (top3.total < p1.total)
	{
		top3 = p1;
		continue;
	}
	p1 = null;
	}
	System.out.printf("%d %d\n%d %d\n%d %d\n",top1.id,top1.total,top2.id,top2.total,top3.id,top3.total);
	}
}

