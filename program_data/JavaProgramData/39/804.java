public class student
{
	public String name = new String(new char[20]);
	public int final;
	public int classgrade;
	public char leader;
	public char west;
	public int essay;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	student m = new student();
	int n;
	int i;
	int a;
	int b;
	int c;
	int d;
	int e;
	int TOTAL;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		stu[i].name = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		stu[i].final = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		stu[i].classgrade = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar5 != null)
	{
		stu[i].leader = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar6 != null)
	{
		stu[i].west = tempVar6.charAt(0);
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		stu[i].essay = Integer.parseInt(tempVar7);
	}
	}
	TOTAL = 0;
	for (i = 0;i < n;i++)
	{
	a = 0;
	b = 0;
	c = 0;
	d = 0;
	e = 0;
	if (stu[i].final > 80 && stu[i].essay >= 1)
	{
	a = 8000;
	}
	if (stu[i].final > 85 && stu[i].classgrade > 80)
	{
	b = 4000;
	}
	if (stu[i].final > 90)
	{
	c = 2000;
	}
	if (stu[i].final > 85 && stu[i].west == 'Y')
	{
	d = 1000;
	}
	if (stu[i].classgrade > 80 && stu[i].leader == 'Y')
	{
	e = 850;
	}
	stu[i].total = a + b + c + d + e;
	TOTAL = TOTAL + stu[i].total;
	}
	for (i = n - 1;i >= 0;i--)
	{
	if (stu[i - 1].total < stu[i].total)
	{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: m=stu[i-1];
	m.copyFrom(stu[i - 1]);
	stu[i - 1] = stu[i];
	stu[i] = m;
	}
	}
	System.out.printf("%s\n%d\n%d",stu[0].name,stu[0].total,TOTAL);
	return 0;
	}
}

