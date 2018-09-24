public class worker
{
	public int name;
	public String au = new String(new char[20]);
	public worker next;
}
public class help
{
	public char author;
	public int max;
}

package <missing>;

public class GlobalMembers
{
	public static worker creat(int m)
	{
		worker p1;
		worker p2;
		worker p;
		int i;
		p1 = p2 = new worker();

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.name = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.au = tempVar2.charAt(0);
		}
		p = p1;
		for (i = 0;i < m - 1;i++)
		{
			p1 = new worker();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.name = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.au = tempVar4.charAt(0);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return p;
	}
	public static void print(worker p)
	{
		worker p1;
		p1 = p;
		while (p1 != null)
		{
			System.out.printf("%d %s\n",p1.name,p1.au);
			p1 = p1.next;
		}
	}
	public static void most(worker p)
	{
		worker p1;
		worker p2;
		int[] a = new int[30];
		int i;
		int max;
		char author;
		help t = new help();
		p1 = p;
		p2 = p;
		while (p1 != null)
		{
			for (i = 0; * (p1.au.Substring(i)) != '\0';i++)
			{
				a[*(p1.au.Substring(i)) - 65] = a[*(p1.au.Substring(i)) - 65] + 1;
			}
			p1 = p1.next;
		}
		for (i = 0,max = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] == max)
			{
				author = i + 65;
			}
		}
		System.out.printf("%c\n%d\n",author,max);
		p1 = p;
		while (p1 != null)
		{
			for (i = 0; * (p1.au.Substring(i)) != '\0';i++)
			{
				if (*(p1.au.Substring(i)) == author)
				{
					System.out.printf("%d\n",p1.name);
				}
			}
			p1 = p1.next;
		}
	}
	public static void Main()
	{
		worker p1;
		worker p;
		help t = new help();
		int m;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		p = creat(m);
		p1 = p;
		//print(p1);
		most(p1);
	}





}

