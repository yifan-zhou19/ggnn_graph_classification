public class student
{
	public String xuehao = new String(new char[100]);
	public String name = new String(new char[100]);
	public char s;
	public int age;
	public float score;
	public String add = new String(new char[100]);

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n = 0;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(1000);
		for (i = 0;i < 1000;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				stu[i].xuehao = tempVar.charAt(0);
			}
			if (stu[i].xuehao.charAt(0) == 'e' && stu[i].xuehao.charAt(1) == 'n' && stu[i].xuehao.charAt(2) == 'd')
			{
				break;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				stu[i].s = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].age = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				stu[i].score = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				stu[i].add = tempVar6.charAt(0);
			}
			n++;
		}
		for (j = n - 1;j >= 0;j--)
		{
			if ((int)stu[j].score == stu[j].score)
			{
			System.out.printf("%s %s %c %d %d %s\n",stu[j].xuehao,stu[j].name,stu[j].s,stu[j].age,(int)stu[j].score,stu[j].add);
			}
			else
			{
				System.out.printf("%s %s %c %d %.1f %s\n",stu[j].xuehao,stu[j].name,stu[j].s,stu[j].age,stu[j].score,stu[j].add);
			}

		}
		return 0;
	}

}

