public class a
{
	public int book;
	public String author = new String(new char[26]);
	public a next;
}

package <missing>;

public class GlobalMembers
{
	public static a creat(int m)
	{
		int i = 0;
		a p;
		a head;
		a temp;
		head = null;
		do
		{
			p = new a();
				if (p == null)
				{
				System.exit(1);
				}
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					p.book = Integer.parseInt(tempVar);
				}
				String tempVar2 = ConsoleInput.scanfRead(" ");
				if (tempVar2 != null)
				{
					p.author = tempVar2.charAt(0);
				}
				if (head == null)
				{
				head = p;
				temp = p;
				}
				else
				{
					temp.next = p;
					temp = p;
				}
				i++;
		}while (i < m);
	temp.next = null;
					return (head);
	}
	public static void Main()
	{
		int h;
		int m;
		int i;
		int j;
		int[] zimu = new int[26];
		a head;
		a p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = creat(m);
		p = head;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < 26;j++)
			{
				if (p.author.charAt(j) >= 'A' && p.author.charAt(j) <= 'Z')
				{
			zimu[p.author.charAt(j) - 'A']++;
				}
			}
			p = p.next;
		}
		h = 0;
		for (i = 0;i < 26;i++)
		{
			if (zimu[i] > zimu[h])
			{
				h = i;
			}
		}
		System.out.printf("%c\n%d\n",'A' + h,zimu[h]);
		p = head;
			for (i = 0;i < m;i++)
			{
			for (j = 0;j < 26;j++)
			{
				if (p.author.charAt(j) == 'A' + h)
				{
					System.out.printf("%d\n",p.book);
					break;
				}
			}
			p = p.next;
			}
	}

}

