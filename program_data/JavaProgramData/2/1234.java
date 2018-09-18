package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char auth[26];
	//		int inf[26];
	//		struct book *next;
	//	};
		book head;
		book p1;
		book p2;
		book t1;
		book t2;
		head = new book();

		int m;
		int i;
		int k;
		int l;
		int j;
		int max;
		int[] authnum = new int[26];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		p1 = head;
		p2 = p1;
		for (i = 0;i < (m - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p1.num) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.auth = tempVar3;
			}
			p2 = new book();
			p1.next = p2;
			p1 = p2;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(p1.num) = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.auth = tempVar5;
		}
		p2 = null;
		p1.next = p2;

		p1 = head;
		p2 = p1;
		while (p1 != null)
		{
			l = p1.auth.length();
			for (j = 0;j < l;j++)
			{
				p1.inf[(*((p1.auth) + j)) - 65] = 1;
				authnum[(*((p1.auth) + j)) - 65]++;
			}
			p2 = p1.next;
			p1 = p2;
		}
		max = 0;
		for (i = 1;i < 26;i++)
		{
			if (authnum[i] > authnum[max])
			{
				max = i;
			}
		}
		System.out.printf("%c\n",(max + 65));
		System.out.printf("%d\n",authnum[max]);

		p1 = head;
		p2 = p1;
		while (p1 != null)
		{
			if ((p1.inf[max]) > 0)
			{
				System.out.printf("%d\n",p1.num);
			}
			p2 = p1.next;
			p1 = p2;
		}
		p1 = head;
		p2 = p1;
		while (p1 != null)
		{
			p2 = p1.next;
			p1 = null;
			p1 = p2;
		}
	}
}

