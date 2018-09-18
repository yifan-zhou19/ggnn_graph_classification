public class book
{
	public int id;
	public String author = new String(new char[27]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book creat()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		book p1;
		book head;
		book p0;
		head = null;
		p1 = head;
		for (i = 0 ; i < n ; i++)
		{
			p0 = new book();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p0.id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p0.author = tempVar3.charAt(0);
			}
			if (head == null)
			{
				p1 = p0;
				head = p1;
				p0.next = null;
			}
			else
			{
				p1.next = p0;
				p0.next = null;
				p1 = p0;
			}
		}
		return (head);
	}
	public static char best(book head)
	{
		int i;
		int max;
		int[] a = new int[26];
		book p;
		p = head;
		for (i = 0;i < 26;++i)
		{
			a[i] = 0;
		}
		while (p != null)
		{
			i = 0;
			while (p.author.charAt(i) != '\0')
			{
				a[p.author.charAt(i) - 'A']++;
				i++;
			}
			p = p.next;
		}
		for (i = 0 ; i < 26 ; i++)
		{
			if (i == 0)
			{
				max = i;
			}
			else if (a[i] > a[max])
			{
				max = i;
			}
		}
		return ('A' + max);
	}
	public static void print(char x, book head)
	{
		int i;
		int k = 0;
		char a = x;
		book p = head;
		while (p != null)
		{
			i = 0;
			while (p.author.charAt(i) != '\0')
			{
				if (p.author.charAt(i) == a)
				{
					k++;
					break;
				}
				i++;
			}
			p = p.next;
		}
		System.out.printf("%c\n%d\n", a, k);
		p = head;
		while (p != null)
		{
			i = 0;
			while (p.author.charAt(i) != '\0')
			{
				if (p.author.charAt(i) == a)
				{
					System.out.printf("%d\n",p.id);
					break;
				}
				i++;
			}
			p = p.next;
		}
	}

	public static void Main(String[] args)
	{
		char writer;
		book head;
		head = creat();
		writer = best(head);
		print(writer, head);
	}

}

