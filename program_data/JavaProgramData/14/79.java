public class student
{
	public int num;
	public int score1;
	public int score2;
	public int score;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100000);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		student * p = new student();
		student p1;
		student t1;
		student t2;
		student t3;
		int tem;
		int tem1;
		for (p = stu;p < stu + n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.score2 = Integer.parseInt(tempVar4);
			}
			p.score = p.score1 + p.score2;
		}
		int max;
		for (p = stu,t1 = stu,max = stu.score;p < stu + n;p++)
		{
			if (p.score > max)
			{
				t1 = p;
				max = p.score;
			}
		}
		for (p = stu,t2 = stu,max = stu.score;p < stu + n;p++)
		{
			if (p == t1)
			{
				continue;
			}
			if (p.score > max)
			{
				t2 = p;
				max = p.score;
			}
		}
		for (p = stu,t3 = stu,max = stu.score;p < stu + n;p++)
		{
			if ((p == t1) || (p == t2))
			{
				continue;
			}
			if (p.score > max)
			{
				t3 = p;
				max = p.score;
			}
		}
		System.out.printf("%d %d\n",t1.num,t1.score);
		System.out.printf("%d %d\n",t2.num,t2.score);
		System.out.printf("%d %d\n",t3.num,t3.score);
	}



}

