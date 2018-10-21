package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct writer
	//	{
	//		int num;
	//		char name[20];
	//		struct writer * next;
	//	};
		int i;
		int j;
		int k;
		int l;
		int m;
		int[] z = new int[26];
		int max;
		int n;
		writer p1;
		writer p2;
		writer p;
		writer head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = p1 = p2 = new writer();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.name = tempVar3;
		}
		for (i = 0;i < n - 1;i++)
		{
			p1 = new writer();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.name = tempVar5;
			}
			p2.next = p1;
			p2 = p1;
		}
		p = head;
		for (i = 0;i < 26;i++) //26?????????????????
		{
			p = head;
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < 20;k++)
				{
					if (p.name[k] == (char)(i + 65))
					{
						z[i]++;
					}
				}
				p = p.next;
			}
		}
		max = z[0];
		j = 0;
		for (i = 0;i < 26;i++)
		{
			if (max < z[i])
			{
				max = z[i];
					j = i; //????????
			}
		}
		System.out.printf("%c\n%d\n",65 + j,max); //??????????
		p = head;
		for (i = 0;i < n;i++) //???????
		{
			for (k = 0;k < 20;k++)
			{
				if (p.name[k] == (char)(65 + j))
				{
					System.out.printf("%d\n",p.num);
					break;
				}
			}
			p = p.next;
		}
	}

}

