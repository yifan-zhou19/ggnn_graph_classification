public class student
{
public String name = new String(new char[21]);
public int fin;
public int cla;
public char q1;
public char q2;
public int pap;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(101);
	public static void Main()
	{
	int n;
	int i;
	String namem = new String(new char[21]);
	int max = 0;
	int[] money = new int[101];
	int total = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	money[i] = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		stu[i].name = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		stu[i].fin = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		stu[i].cla = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar5 != null)
	{
		stu[i].q1 = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar6 != null)
	{
		stu[i].q2 = tempVar6.charAt(0);
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		stu[i].pap = Integer.parseInt(tempVar7);
	}
	if (stu[i].fin > 80 && stu[i].pap > 0)
	{
		money[i] += 8000;
	}
	if (stu[i].fin > 85 && stu[i].cla > 80)
	{
		money[i] += 4000;
	}
	if (stu[i].fin > 90)
	{
		money[i] += 2000;
	}
	if (stu[i].fin > 85 && stu[i].q2 == 'Y')
	{
		money[i] += 1000;
	}
	if (stu[i].cla > 80 && stu[i].q1 == 'Y')
	{
		money[i] += 850;
	}
	if (money[i] > money[max])
	{
		max = i;
	}
	total += money[i];
	}
	System.out.printf("%s\n%d\n%d\n",stu[max].name,money[max],total);
	}
}

