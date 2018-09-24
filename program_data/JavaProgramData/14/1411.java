public class stu1
{
	public int num;
	public int score1;
	public int score2;
	public stu1 next;
}

package <missing>;

public class GlobalMembers
{
	public static stu1 creat()
	{
		int n;
		int i = 1;

		stu1 h;

		stu1 q1;
		stu1 q2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q2 = q1 = (stu1)malloc(LEN1);

		h = null;
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q1.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q1.score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				q1.score2 = Integer.parseInt(tempVar4);
			}


			if (i == 1)
			{
				h = q1;
			}
			else
			{
				q2 = q1;
			}
			if (i != n)
			{

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				q1 = q2.next = (stu1)malloc(LEN1);
			}
			else
			{
				q1.next = null;
			}
			i++;
		}
		return (h);
	}

	public static stu1 turn(stu1 h)
	{
		int t = 1;
		stu1 p1;
		stu1 p2;
		int m;
		int n;
		int w;
		for (p1 = h,t = 1;p1.next != null,t <= 3;p1 = p1.next,t++)
		{
			p2 = p1.next;
			while (p2 != null)
			{
				if ((p1.score1 + p1.score2) < (p2.score1 + p2.score2))
				{
					m = p1.num;
					n = p1.score1;
					w = p1.score2;
					p1.num = p2.num;
					p1.score1 = p2.score1;
					p1.score2 = p2.score2;
					p2.num = m;
					p2.score1 = n;
					p2.score2 = w;
				}
				p2 = p2.next;
			}
			System.out.printf("%ld %d\n",p1.num,(p1.score1 + p1.score2));
		}
		return (h);
	}
	/*void print(struct stu1 *h)
	{
		int t=1;
		struct stu1 *p;
		p=h;
		for(t=1;t<=3;t++)
		{
			printf("%ld %d\n",p->num,(p->score1+p->score2));
			p=p->next;
		}
	}*/
	public static void Main()
	{
		stu1 ip;
		ip = creat();
		/*is=*/
		turn(ip);
		/*print(is);*/
	}
}

