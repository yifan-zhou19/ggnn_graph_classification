public class stu
{
public int num;
public int chinese;
public int maths;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] stu = tangible.Arrays.initializeWithDefaultstuInstances(100000);

	public static void Main()
	{
	int i;
	int j;
	int n;
	int[] sum = new int[100000];
	int max = 0;
	int m;
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
		stu[i].num = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		stu[i].chinese = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		stu[i].maths = Integer.parseInt(tempVar4);
	}
	}
	for (i = 0;i < n;i++)
	{
	sum[i] = stu[i].chinese + stu[i].maths;
	}
	for (j = 0;j < 3;j++)
	{
	for (i = 0;i < n;i++)
	{
	if (sum[i] > max)
	{
		max = sum[i];
	m = i;
	}
	}
	System.out.printf("%d %d\n",stu[m].num,sum[m]);
	sum[m] = 0;
	max = 0;
	}
	}
}

