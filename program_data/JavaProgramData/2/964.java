public class book
{
	public int num;
	public String writer = new String(new char[27]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] time = new int[26];
	public static int max;
	public static int k;
	public static book create(int m)
	{
		book head;
		book p1;
		book p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (book)malloc(LEN);

		head = null;
		while (n < m)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.writer = tempVar2.charAt(0);
			}
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
			p1 = (book)malloc(LEN);

		}
		p2.next = null;
		return (head);
	}

	public static void search(book head)
	{
		int i;
		book p;
		p = head;
		if (head != null)
		{
			do
			{
				for (i = 0;(p.writer).charAt(i) != '\0';i++)
				{
					time[(p.writer).charAt(i) - 'A']++;
				}
				p = p.next;
			} while (p != null);
		}
	}

	public static void pr(book head)
	{
		int i;
		book p;
		p = head;
		if (head != null)
		{
			do
			{
				for (i = 0;(p.writer).charAt(i) != '\0';i++)
				{
					if ((p.writer).charAt(i) == 'A' + k)
					{
						System.out.printf("%d\n",p.num);
					}
				}
				head = p;
				p = p.next;
				head = null;
			} while (p != null);
		}
	}


	public static void Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		book head;
		head = create(m);
		search(head);
		max = time[0];
		k = 0;
		for (i = 1;i < 26;i++)
		{
			if (time[i] > max)
			{
				max = time[i];
				k = i;
			}
		}
		System.out.printf("%c\n%d\n",'A' + k,max);
		pr(head);
	}




}

