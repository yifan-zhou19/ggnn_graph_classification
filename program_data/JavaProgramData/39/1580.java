public class stu
{
	public String name = new String(new char[20]);
public int s1;
public int s2;
public char a1;
public char a2;
public int pa;

}

package <missing>;

public class GlobalMembers
{
	public static stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int sumt;
		int j;
	int[] sum = new int[100];
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
		stu[i].s1 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		stu[i].s2 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar5 != null)
	{
		stu[i].a1 = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar6 != null)
	{
		stu[i].a2 = tempVar6.charAt(0);
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		stu[i].pa = Integer.parseInt(tempVar7);
	}
	}
	for (i = 0;i < n;i++)
	{
		sum[i] = 0;
		if (stu[i].s1 > 80 && stu[i].pa > 0)
		{
			sum[i] = (sum[i] + 8000);
		}
		if (stu[i].s1 > 85 && stu[i].s2 > 80)
		{
			sum[i] = (sum[i] + 4000);
		}
		if (stu[i].s1 > 90)
		{
			sum[i] = (sum[i] + 2000);
		}
		if (stu[i].s1 > 85 && stu[i].a2 == 'Y')
		{
			sum[i] = (sum[i] + 1000);
		}
		if (stu[i].s2 > 80 && stu[i].a1 == 'Y')
		{
			sum[i] = (sum[i] + 850);
		}
	}
	sumt = sum[0];
	for (i = 1;i < n;i++)
	{
	sumt = sumt + sum[i];
	}
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
	if (sum[i] < sum[j])
	{
	break;
	}
		}
	if (j == n)
	{
	break;
	}
	}
	System.out.printf("%s\n%d\n%d",stu[i].name,sum[i],sumt);
	}
}

