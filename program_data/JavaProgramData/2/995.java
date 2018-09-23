public class book
{
	public int num;
	public String writer = new String(new char[27]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book head;
	public static int[] times = new int[26];

	public static void create(int m)
	{
		book p1;
		book p2;
		int i;
		for (i = 0;i <= m - 1;i++)
		{
			p1 = new book();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.writer = tempVar2.charAt(0);
			}
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
		}
		p2.next = null;
	}
	public static int count()
	{
		int max;
		int l;
		int i;
		String temp = new String(new char[27]);
		book p1;
		for (i = 0;i <= 25;i++)
		{
			times[i] = 0;
		}
		p1 = head;
		while (p1 != null)
		{
			l = p1.writer.length();
			temp = p1.writer;
			for (i = 0;i <= l - 1;i++)
			{
				times[temp.charAt(i) - 65]++;
			}
			p1 = p1.next;
		}
		max = 0;
		for (i = 0;i <= 25;i++)
		{
			if (times[i] > times[max])
			{
				max = i;
			}
		}
		return (max);
	}
	public static void print(int max)
	{
		book p1;
		int[] abc = new int[999];
		int total;
		int l;
		int i;
		String temp = new String(new char[27]);

		total = 0;
		System.out.printf("%c\n",max + 65);
		p1 = head;
		while (p1 != null)
		{
			temp = p1.writer;
			l = temp.length();
			for (i = 0;i <= l - 1;i++)
			{
				if (max + 65 == temp.charAt(i))
				{
					break;
				}
			}
			if (i < l)
			{
				abc[total] = p1.num;
				total++;
			}
			p1 = p1.next;
		}
		System.out.printf("%d\n",total);
		for (i = 0;i <= total - 1;i++)
		{
			System.out.printf("%d\n",abc[i]);
		}
	}
	public static void Main()
	{
		int max;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		create(m);
		max = count();
		print(max);
	}
}

