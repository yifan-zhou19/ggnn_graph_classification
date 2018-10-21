public class student
{
public String name = new String(new char[20]);
public int scholar;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);

	public static int Main()
	{
	int n;
	int i;
	int j;
	int total = 0;
	int final;
	int class1;
	int paper;
	int maxid;
	int maxscholar = 0;
	String t1 = new String(new char[2]);
	String t2 = new String(new char[2]);
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			final = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			class1 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			t1 = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			t2 = tempVar6.charAt(0);
		}
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			paper = Integer.parseInt(tempVar7);
		}
		if (final > 80 && paper >= 1)
		{
			stu[i].scholar += 8000;
		}
		if (final > 85 && class1 > 80)
		{
			stu[i].scholar += 4000;
		}
		if (final > 90)
		{
			stu[i].scholar += 2000;
		}
		if (final > 85 && t2.charAt(0) == 'Y')
		{
			stu[i].scholar += 1000;
		}
		if (class1 > 80 && t1.charAt(0) == 'Y')
		{
			stu[i].scholar += 850;
		}
		total += stu[i].scholar;
		if (maxscholar < stu[i].scholar)
		{
			maxscholar = stu[i].scholar;
			maxid = i;
		}
	}
	System.out.printf("%s\n%d\n%d\n",stu[maxid].name,maxscholar,total);
	}

}

