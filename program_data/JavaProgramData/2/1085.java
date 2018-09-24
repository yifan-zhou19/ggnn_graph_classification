package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct book
	//	{
	//		int No;
	//		char author[27];
	//		int yes;
	//		struct book *next;
	//	};
		book head;
		book p;
		int m;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *max;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *count;
		int count;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		count = (int)malloc(26 * (Integer.SIZE / Byte.SIZE));
		for (i = 0;i < 26;i++)
		{
			*(count + i) = 0;
		}

		p = new book();
		head = p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.No = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.author = tempVar3;
			}
			if (i == m - 1)
			{
				p.next = null;
			}
			else
			{
				p.next = new book();
			}
			p = p.next;
		}

		p = head;
		while (p != null)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * point;
			point = p.author;
			while (*point != '\0')
			{
				(*(count + ((*point) - 65)))++;
				point++;
			}
			p = p.next;
		}

		max = count;
		for (i = 0;i < 26;i++)
		{
			if (*(count + i) > max)
			{
				max = count + i;
			}
		}
		System.out.printf("%c\n",max - count + 65);
		System.out.printf("%d\n", max);

		p = head;
		while (p != null)
		{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			char * point;
			point = p.author;
			while (*point != '\0')
			{
				if (*point == max - count + 65)
				{
					System.out.printf("%d\n",p.No);
				}
				point++;
			}
			p = p.next;
		}
		return 0;
	}
}

