public class st
{
	public int a;
	public String s = new String(new char[26]);
	public st n;
}

package <missing>;

public class GlobalMembers
{
	public static st ;
	public static st creat(int m)
	{
		int i;
		st p1;
		st p2;
		st head;
		for (i = 0;i < m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (st)malloc(len);
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.n = p1;
			}
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.s = tempVar2.charAt(0);
			}
			p2 = p1;
		}
		p1.n = null;
		return (head);
	}
	public static void Main()
	{
		int m;
		st creat = new st(int m);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		st p;
		st q;
		p = creat(m);
		q = p;
		int i;
		int j;
		int k;
		int[] a = new int[26];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < (k = p.s.length());j++)
			{
				a[p.s.charAt(j) - 65]++;
			}
			p = p.n;
		}
		p = q;
		int max = a[0];
		for (i = 1;i < 26;i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		char c;
		for (i = 0;i < 26;i++)
		{
			if (a[i] == max)
			{
				c = i + 65;
				System.out.printf("%c\n%d\n",c,a[i]);
				break;
			}
		}
		char cc;
		for (i = 0;i < m;i++)
		{
			for (j = 0;;j++)
			{
				cc = q.s.charAt(j);
				if (cc == '\0')
				{
					break;
				}
				if (c == cc)
				{
					System.out.printf("%d\n",q.a);
				}
			}
			q = q.n;
		}
	}
}

