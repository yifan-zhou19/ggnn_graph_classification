public class student
{
	public int id;
	public int chinese;
	public int math;
	public int score;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat()
	{
		int num;
		student head;
		student p;
		student q;
		q = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = (student)malloc(len);
		p = head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		while (num > 0)
		{
			q = p;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.chinese = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.math = Integer.parseInt(tempVar4);
			}
			p.score = p.chinese + p.math;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (student)malloc(len);
			q.next = p;
			num--;
		}
		p.next = null;
		return (head);
	}

	public static void Main()
	{
		int i;
		student p;
		student head;
		student[] max = tangible.Arrays.initializeWithDefaultstudentInstances(3);
		head = creat();
		p = head;
		for (i = 0;i <= 2;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			max[i] = (student)malloc(len);
			max[i].score = 0;
		}
		for (;p != null;p = p.next)
		{
			if (p.score > max[0].score)
			{
				max[2] = max[1];
				max[1] = max[0];
				max[0] = p;
			}
			else if (p.score > max[1].score)
			{
				max[2] = max[1];
				max[1] = p;
			}
			else if (p.score > max[2].score)
			{
				max[2] = p;
			}
		}
			for (i = 0;i <= 2;i++)
			{
			System.out.printf("%ld %d\n",max[i].id,max[i].score);
			}
	}
}

