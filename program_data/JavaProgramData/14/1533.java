package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int num;
	//		int chinese;
	//		int math;
	//		int sum;
	//		struct stu *next;
	//	};
		int n;
		int max;
		int i;
		stu p1;
		stu p2;
		stu head;
		stu maxsum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.chinese = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.math = tempVar4;
		}
		for (i = 1;i < n;i++)
		{
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu)malloc(LEN);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.num = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.chinese = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.math = tempVar7;
			}
		}
		p2.next = p1;
		p2 = p1;
		p2.next = null;

		p1 = head;
		while (p1.next != null)
		{
			p1.sum = p1.chinese + p1.math;
			p1 = p1.next;
		}
		p1.sum = p1.chinese + p1.math;
		for (i = 1;i <= 3;i++)
		{
			p1 = head;
			max = p1.sum;
			maxsum = p1;
			while (p1.next != null)
			{
			  if (p1.sum > max)
			  {
				maxsum = p1;
				max = p1.sum;
			  }
			  p1 = p1.next;

			}
			if (p1.sum > max)
			{
				maxsum = p1;
				max = p1.sum;
			}
		  System.out.printf("%d %d\n",maxsum.num,maxsum.sum);
		  maxsum.sum = 0;
		}
	}





}

