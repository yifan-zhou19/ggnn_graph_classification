package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char wri[26];
	//		struct book *next;
	//	};
		int n;
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		book head;
		book p1;
		book p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (book)malloc(L);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.wri = tempVar3;
		}
		head = null;
		for (i = 0;i < m - 1;i++)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(L);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.wri = tempVar5;
			}
		}
		p2.next = p1;
		p2 = p1;
		p2.next = null;
		int[] a = new int[26];
		int b;
		int j;
		int k;
		int max1 = 0;
		int max2;
		book g;
		g = head;
		do
		{
			for (i = 0;i < 26;i++)
			{
				if (g.wri[i] != '\0')
				{
					b = g.wri[i];
					a[b - 65] = a[b - 65] + 1;
				}
			}
			g = g.next;
		}while (g != null);
		for (i = 0;i < 26;i++)
		{
			if (max1 < a[i])
			{
				max1 = a[i];
				max2 = i;
			}
		}
		max2 = max2 + 65;
		System.out.printf("%c\n%d",max2,max1);
		g = head;
		do
		{
			for (i = 0;i < 26;i++)
			{
				if (g.wri[i] == max2)
				{
					System.out.printf("\n%d",g.num);
					break;
				}
			}

			g = g.next;
		}while (g != null);
	}
}

