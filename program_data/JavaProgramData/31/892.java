public class student
{
	public String num = new String(new char[20]);
	public String name = new String(new char[20]);
	public char sex;
	public int age;
	public float score;
	public String address = new String(new char[1000]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(10000);
	public static int Main()
	{
		student head;
		student p;
		int i;
		int j;
		final String str = "end";
		for (i = 0;;i++)
		{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					stu[i].num = tempVar.charAt(0);
				}
				if (strcmp(stu[i].num,str) == 0)
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
					stu[i].sex = tempVar3.charAt(0);
				}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					stu[i].age = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					stu[i].score = Float.parseFloat(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					stu[i].address = tempVar6.charAt(0);
				}
		}
		stu[0].next = null;
		for (j = 1;j < i;j++)
		{
			stu[j].next = stu[j - 1];
		}
		head = stu[i - 1];
		if (i > 0)
		{
				for (p = head;p != null;p = p.next)
				{
				System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.address);
				}
		}

		return 0;
	}


}

