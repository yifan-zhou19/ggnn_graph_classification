public class student
{
	public int num;
	public int score1;
	public int score2;
	public int sum;
	public student next;
	public student before;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;
		student head;
		student p1;
		student p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.score1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.score1 = Integer.parseInt(tempVar4);
		}
		p1.sum = p1.score1 + p1.score2;
		m1 = p1.sum;
		n1 = p1.num;
		head = null;
		i = 0;
		while (i <= n - 2)
		{
			i++;
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p1.before = p2;
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.score1 = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.score2 = Integer.parseInt(tempVar7);
			}
			p1.sum = p1.score1 + p1.score2;
			if (p1.sum > m3 && p1.sum <= m2)
			{
				m3 = p1.sum;
				n3 = p1.num;
			}
			if (p1.sum > m2 && p1.sum <= m1)
			{
				m3 = m2;
				n3 = n2;
				m2 = p1.sum;
				n2 = p1.num;
			}
			if (p1.sum > m1)
			{
				m3 = m2;
				n3 = n2;
				m2 = m1;
				n2 = n1;
				m1 = p1.sum;
				n1 = p1.num;
			}
		}
		System.out.printf("%d %d\n",n1,m1);
		System.out.printf("%d %d\n",n2,m2);
		System.out.printf("%d %d\n",n3,m3);
	}
}

