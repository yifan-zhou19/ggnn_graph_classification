package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char id[9];
	//		int chn;
	//		int math;
	//		int both;
	//		struct stu *next;
	//	};
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		stu head;
		stu p1;
		stu p2;
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				head = new stu();
				p1 = head;
			}
			else
			{
				p1.next = new stu();
				p1 = p1.next;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.chn = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.math = tempVar4;
			}
			p1.both = p1.chn + p1.math;
		}
		p1.next = null;
		int max;
		for (i = 0;i < 3;i++)
		{
			max = head.both;
			p1 = head;
			do
			{
			   p1 = p1.next;
			   if (max < p1.both)
			   {
				 max = p1.both;
				 p2 = p1;
			   }
			}while (p1.next != null);
			System.out.printf("%s %d\n",p2.id,p2.both);
			p2.both = 0;
		}
		return 0;
	}
}

