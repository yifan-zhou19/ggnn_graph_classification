public class student
{
	public String num = new String(new char[12]);
	public String name = new String(new char[25]);
	public char sex;
	public int age;
	public String score = new String(new char[6]);
	public String add = new String(new char[12]);
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(max);
	public static int Main()
	{
		int i;
		int n;
		int j;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				stu[i].num = tempVar.charAt(0);
			}
			if (stu[i].num.charAt(0) == 'e')
			{
				break;
			}
			else
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
			}
		}
		if (i == 0)
		{
			System.out.print("\n");
		}
		else
		{
		for (j = i - 1;j >= 0;j--)
		{
			System.out.printf("%s %s %c %d %s %s\n",stu[j].num,stu[j].name,stu[j].sex,stu[j].age,stu[j].score,stu[j].add);
		}
		}
		return 0;
	}

}

