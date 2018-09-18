public class student
{
public int num;
public int chi;
public int math;
public int add;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
	public static void Main()
	{
	int m;
	int k;
	int n;
	int i;
	int j;
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
		 stu[i].chi = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead(" ");
	 if (tempVar4 != null)
	 {
		 stu[i].math = Integer.parseInt(tempVar4);
	 }
	 stu[i].add = stu[i].chi + stu[i].math;
	}
	for (j = 0;j < 3;j++)
	{
	 for (i = n - 1;i > 0;i--)
	 {
	 if (stu[i].add > stu[i - 1].add)
	 {
	 k = stu[i].add;
	 stu[i].add = stu[i - 1].add;
	 stu[i - 1].add = k;
	 m = stu[i].num;
	 stu[i].num = stu[i - 1].num;
	 stu[i - 1].num = m;
	 }
	 }
	}
	for (i = 0;i < 3;i++)
	{
	System.out.printf("%ld %d\n",stu[i].num,stu[i].add);
	}
	}


}

