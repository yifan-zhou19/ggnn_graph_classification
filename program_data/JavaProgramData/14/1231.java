public class student
{
public int id;
public int ch;
public int math;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	int n;
	int i;
	int j;
	int sum = 0;
	int id1 = 0;
	int flag = 0;
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
		stu[i].id = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		stu[i].ch = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		stu[i].math = Integer.parseInt(tempVar4);
	}
	}
	for (i = 0;i < 3;i++)
	{
	for (j = 0;j < n;j++)
	{
	if ((stu[j].ch + stu[j].math) > sum)
	{
		sum = stu[j].ch + stu[j].math;
	id1 = stu[j].id;
	flag = j;
	}
	}
	System.out.printf("%d %d\n",id1,sum);
	sum = 0;
	id1 = 0;
	stu[flag].ch = 0;
	stu[flag].math = 0;
	flag = 0;
	}
	}


}

