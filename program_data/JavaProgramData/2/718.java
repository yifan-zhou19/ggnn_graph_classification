public class book
{
	public int num;
	public String wr = new String(new char[26]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int m = 0;
		int j;
		int a;
		int b;
		int c;
		int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		book head;
		book p1;
		book p2;
		book p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (book)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.wr = tempVar3.charAt(0);
		}
		head = null;
		while (m != n - 1)
		{
			m = m + 1;
			if (m == 1)
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
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.wr = tempVar5.charAt(0);
			}
		}
		p2.next = p1;
		p2 = p1;
		p2.next = null;
		p = head;
		do
		{
			b = p.wr.length();
			for (j = 0;j < b;j++)
			{
				s[p.wr.charAt(j)]++;
			}
			p = p.next;
		}while (p != null);

		a = s[65];
		c = 65;
		for (i = 66;i < 91;i++)
		{
			if (a < s[i])
			{
				a = s[i];
				c = i;
			}
		}
		System.out.printf("%c\n%d\n",c,a);

		p = head;
		do
		{
			b = p.wr.length();
			for (j = 0;j < b;j++)
			{
				if (p.wr.charAt(j) == c)
				{
					System.out.printf("%d\n",p.num);
				}
			}
			p = p.next;
		}while (p != null);
	}
}

