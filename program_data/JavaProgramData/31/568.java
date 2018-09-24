public class student
{
	public String num = new String(new char[20]);
public String name = new String(new char[20]);
public char sex;
public int age;
public String score = new String(new char[20]);
public String add = new String(new char[20]);
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int s = 0;
	int t = 0;
	student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(1000);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		stu[0].num = tempVar.charAt(0);
	}
	while (stu[i].num.charAt(0) != 'e')
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		stu[i].name = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ", 1);
	if (tempVar3 != null)
	{
		stu[i].sex = tempVar3.charAt(0);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		stu[i].age = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		stu[i].score = tempVar5.charAt(0);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		stu[i].add = tempVar6.charAt(0);
	}
	i++;
	s++;
	String tempVar7 = ConsoleInput.scanfRead();
	if (tempVar7 != null)
	{
		stu[i].num = tempVar7.charAt(0);
	}
	}
	for (i = s - 1;i >= 0;i--)
	{
	System.out.printf("%s %s %c %d %s %s\n",stu[i].num,stu[i].name,stu[i].sex,stu[i].age,stu[i].score,stu[i].add);
	}
	return 0;
	}

}

