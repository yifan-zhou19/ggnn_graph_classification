package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct s
	//	{
	//		int a;
	//		char b[100];
	//		struct s *next;
	//	};
		s p1;
		s p2;
		s head;
		int m;
		int n;
		int i;
		int j;
		int k;
		int t;
		int[] d = new int[50];
		int max;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = new s();
		p2 = p1;
		head = p1;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.a = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.b = tempVar3;
		}
		for (i = 0;i < n - 1;i++)
		{
			p1 = new s();
			p2.next = p1;
			p2 = p1;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.a = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.b = tempVar5;
			}
		}
		p2.next = 0;
		t = 0;
		p1 = p2 = head;

		for (c = 'A';c <= 'Z';c++)
		{
			k = 0;
			for (i = 0;i < n;i++)
			{
				j = 0;
				while (p1.b[j] != '\0')
				{
					if (c == p1.b[j])
					{
						k++;
					}
					j++;
				}
				p1 = p1.next;

			}

			d[t] = k;

			t++;
			p1 = head;
		}
		j = 0;
		max = d[0];
		for (i = 1;i < 26;i++)
		{
			if (d[i] > max)
			{
				max = d[i];
				j = i;
			}
		}
		System.out.printf("%c\n",'A' + j);
		System.out.printf("%d\n",max);
		t = 'A' + j;
	for (i = 0;i < n;i++)
	{
				j = 0;
				while (p1.b[j] != '\0')
				{
					if (t == p1.b[j])
					{
						System.out.printf("%d\n",p1.a);
					}
					j++;
				}
				p1 = p1.next;

	}

	}
}

