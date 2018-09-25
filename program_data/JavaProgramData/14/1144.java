public class student
{
	public int num;
 public int yu;
 public int shu;
 public int score;
 public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int max;
		student p1;
		student p2;
		student head;
		p1 = p2 = head = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			p1 = new student();

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.yu = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.shu = Integer.parseInt(tempVar4);
			}

			p1.score = p1.yu + p1.shu;
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
		}
			p2.next = null;


			for (i = 0;i < 3;i++)
			{
				p2 = p1 = head;
				max = p1.score;
				while (p1 != null)
				{
					if (p1.score > max)
					{
						max = p1.score;
						p2 = p1;
					}
					p1 = p1.next;
				}
				System.out.printf("%d %d\n",p2.num,max);
				p1 = head;
				while (p1.next != p2)
				{
					p1 = p1.next;
				}
				p1.next = p2.next;
			}
	}

}

