public class stu
{
public String name = new String(new char[20]);
public int grade;
public int point;
public char job;
public char home;
public int paper;
public int sum;
}

package <missing>;

public class GlobalMembers
{
	public static stu[] student = tangible.Arrays.initializeWithDefaultstuInstances(100);

	public static void Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	student[i].sum = 0;
	}
	for (i = 0;i < n;i++)
	{
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 student[i].name = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 student[i].grade = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead(" ");
	 if (tempVar4 != null)
	 {
		 student[i].point = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	 if (tempVar5 != null)
	 {
		 student[i].job = tempVar5.charAt(0);
	 }
	 String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	 if (tempVar6 != null)
	 {
		 student[i].home = tempVar6.charAt(0);
	 }
	 String tempVar7 = ConsoleInput.scanfRead(" ");
	 if (tempVar7 != null)
	 {
		 student[i].paper = Integer.parseInt(tempVar7);
	 }
	 if (student[i].grade > 80 && student[i].paper > 0)
	 {
		  student[i].sum += 8000;
	 }
	 if (student[i].grade > 85 && student[i].point > 80)
	 {
		  student[i].sum += 4000;
	 }
	 if (student[i].grade > 90)
	 {
		  student[i].sum += 2000;
	 }
	 if (student[i].grade > 85 && student[i].home == 'Y')
	 {
		  student[i].sum += 1000;
	 }
	 if (student[i].point > 80 && student[i].job == 'Y')
	 {
		  student[i].sum += 850;
	 }
	}
	int max;
	max = student[0].sum;
	for (i = 0;i < n;i++)
	{
	 if (student[i].sum > max)
	 {
	 max = student[i].sum;
	 }
	}
	for (i = 0;i < n;i++)
	{
	if (max == student[i].sum)
	{
	System.out.printf("%s\n%d\n",student[i].name,student[i].sum);
	break;
	}
	}
	int SUM = 0;
	for (i = 0;i < n;i++)
	{
	 SUM += student[i].sum;
	}
	System.out.printf("%d",SUM);
	}
}

