package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		char num[20];
	//		char ren[30];
	//		struct book *next;
	//	};

		int n;
		int[] a = new int[26];
		book head;
		book p1;
		book p2;
		int i;
		int j;
		char tem;
		char[][] b = new char[100][30];

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (book)malloc(L);
		head = p1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.ren = tempVar3;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(L);
			p2.next = p1;
		}
		p1 = head;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < p1.ren.length();j++)
			{
				int t = p1.ren[j] - 'A';
				a[t]++;
			}
			p1 = p1.next;
		}

		int max = 0;
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				tem = 'A' + i;
			}
		}
		System.out.printf("%c\n",tem);
		p1 = head;
		int u = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < p1.ren.length();j++)
			{
				if (p1.ren[j] == tem)
				{
					b[u] = p1.num;
					u++;
				}
			}
			p1 = p1.next;
		}
		System.out.printf("%d\n",u);

		for (i = 0;i < u;i++)
		{
			System.out.printf("%s\n",b[i]);
		}
	}
}

