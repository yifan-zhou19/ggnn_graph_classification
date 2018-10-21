package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int num;
	//		char author[27];
	//		struct book *next;
	//	}
	//	*head = 0,*p1,*p2;
		int total;
		int i;
		int j;
		int[] sumbook = new int[26];
		int len;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			total = Integer.parseInt(tempVar);
		}
		for (i = 0;i < total;i++)
		{
			p1 = new book();
			if (p1 == 0)
			{
				System.out.print("Memory request failed!\n");
				System.exit(-1);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.author = tempVar3;
			}
			len = p1.author.length();
			for (j = 0;j < len;j++)
			{
				sumbook[p1.author[j] - 'A']++;
			}
			if (head)
			{
				p2.next = p1;
			}
			else
			{
				head = p1;
			}
			p2 = p1;
		}
		p1.next = 0;
		len = 0;
		for (i = 0;i < 26;i++)
		{
			if (sumbook[i] > len)
			{
				len = sumbook[i];
				max = i;
			}
		}
		System.out.printf("%c\n%d\n",max + 'A',sumbook[max]);
		max += 'A';
		for (p1 = head;p1;p1 = p1.next)
		{
			len = p1.author.length();
			for (i = 0;i < len;i++)
			{
				if (p1.author[i] == max)
				{
					System.out.printf("%d\n",p1.num);
					break;
				}
			}
		}
	}
}

