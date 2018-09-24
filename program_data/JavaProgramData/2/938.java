public class a
{
	public int number;
	public String authors = new String(new char[26]);
	public a next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int max = 0;
	public static int Main()
	{
		a create = new a();
		char sum = struct a * ;
		void pr(char x,struct a * head);
		a head;
		char x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create();
		x = sum(head);
		pr(x, head);
	}
	public static a create()
	{
		a head;
		a p1;
		a p2;
		int i;
		p1 = len;
		head = p1;
		p2 = p1;
		for (i = 0;i < n;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.number = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.authors = tempVar2.charAt(0);
			}
			if (i != n - 1)
			{
				p1 = len;
				p2.next = p1;
				p2 = p2.next;
			}
			else
			{
				p1.next = null_Renamed;
			}
		}
		return head;
	}
	public static char sum(a head)
	{
		a p;
		p = head;
		int[] a = new int[26];
		int i;
		int j;
		char zd;
		for (i = 0;i < n;i++)
		{
			for (j = 0; * (p.authors.Substring(j)) != '\0';j++)
			{
				a[*(p.authors.Substring(j)) - 65]++;
			}
			p = p.next;
		}
		for (i = 0;i < 26;i++)
		{
			if (a[i] > max)
			{
			max = a[i];
			zd = i;
			}
		}
		System.out.printf("%c\n%d",zd + 65,a[zd]);
		return (zd + 65);
	}
	public static void pr(char x, a head)
	{
		int i;
		int j;
		int num;
		a p;
		p = head;
		for (i = 0;i < n;i++)
		{
			num = 0;
			for (j = 0; * (p.authors.Substring(j)) != '\0';j++)
			{
				if (*(p.authors.Substring(j)) == x)
				{
					num = 1;
				}
			}
			if (num != 0)
			{
				System.out.printf("\n%d",p.number);
			}
			p = p.next;
		}
	}
}

