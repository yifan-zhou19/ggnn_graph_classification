public class book
{
	public int num;
	public String zz = new String(new char[32]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book creat(int n)
	{
		book head;
		book p1;
		book p2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (book)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.zz = tempVar2.charAt(0);
		}
		head = null;
		for (i = 0;i < n - 1;i++)
		{
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (book)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.zz = tempVar4.charAt(0);
			}
		}
		p2.next = p1;
		p1.next = null;
		return (head);
	}
	public static void search(book head, int n)
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[26],i,j;
		int[] p = new int[26];
		int i;
		int j;
		book q = head;
		for (i = 0;i < 26;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p[i] = (int)malloc((Integer.SIZE / Byte.SIZE));
			p[i] = null;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;(q.zz).charAt(j) != '\0';j++)
			{
				(p[(q.zz).charAt(j) - 'A'])++;
			}
			q = q.next;
		}
		q = head;
		int max = p[0];
		int k = 0;
		for (i = 1;i < 26;i++)
		{
			if (p[i] > max)
			{
				max = p[i];
				k = i;
			}
		}
		System.out.printf("%c\n%d",'A' + k,max);
		for (i = 0;i < n;i++)
		{
			for (j = 0;(q.zz).charAt(j) != '\0';j++)
			{
				if ((q.zz).charAt(j) == 'A' + k)
				{
					System.out.printf("\n%d",q.num);
				}
			}
			q = q.next;
		}
	}



	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		book head;
		head = creat(n);
		search(head, n);
	}
}

