///#define NULL 0
public class student
{
	public int num;
	public int ch;
	public int math;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
		student head;
		student p1;
		student p2;
		int i;
		p1 = p2 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.ch = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.math = Integer.parseInt(tempVar3);
		}
		//head=NULL;
		for (i = 0;i < n - 1;i++)
		{
			if (i == 0)
			{
				head = p1;
			}

			p1 = new student();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.ch = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.math = Integer.parseInt(tempVar6);
			}
			p2.next = p1;
			p2 = p1;
		}

		p2.next = null;
		return (head);
	}
	public static void print(student head)
	{
		student p;
		p = head;
		if (head != null)
		{
			do
			{
				System.out.printf("%d %d %d",p.num,p.ch,p.math);
				p = p.next;
			}while (p != null);
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		student p1;
		student p2;
		student p3;
		student p;
		student g = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = creat(n);
		p1 = p;

		p2 = p;
		p3 = p;
		for (i = 0;i < n;i++)
		{
			p1.sum = p1.math + p1.ch;
			//printf("%d\n",p1->sum);
			p1 = p1.next;

		}
		p1 = p;
		p2 = p;
		System.out.print("\n\n");
		i = 0;
		while (i < 3)
		{
			p1 = p2.next;
			while (p1 != null)
			{

				if ((p2.sum) < (p1.sum))
				{
					g.num = p2.num;
					p2.num = p1.num;
					p1.num = g.num;
					g.sum = p2.sum;
					p2.sum = p1.sum;
					p1.sum = g.sum;
				}
				p1 = p1.next;

			}

			p2 = p2.next;
			i = i + 1;

		}
		p1 = p;
		p2 = p;
		//printf("\n\n");
		/*for(i=0;i<n;i++)
		{
	
		    printf("%d\n",p1->sum);
			p1=p1->next;
	
		}*/
		p1 = p;
		for (i = 0;i < 3;i++)
		{

			System.out.printf("%d %d\n",p1.num,p1.sum);
			p1 = p1.next;
		}
	}

}

