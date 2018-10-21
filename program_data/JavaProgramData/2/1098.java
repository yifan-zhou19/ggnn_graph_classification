public class stu
{
	public int num;
	public String name = new String(new char[30]);

	public stu next;
}
	i = 0;

package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[30];
	public static int[][] b = new int[30][1000];
	public static stu creat(int n)
	{
		stu p1;
		stu p2;
		stu head;
		int i = 0;
		p1 = p2 = new stu();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		head = null;
		for (i = 0;i < n;i++)
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
			if (i < n - 1)
			{
				p1 = new stu();
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p1.num = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					p1.name = tempVar4.charAt(0);
				}
			}
		}
		p2.next = null;
		return head;
	}
	public static int check(stu head, int n)
	{
		int i;
		int j;
		int s;
		int d = 0;
		int f = 0;
		String t;
		stu p;
		p = head;
		for (i = 0;i < n;i++,p = p.next)
		{
			s = p.name.length();
			t = p.name;
			for (j = 0;j < s;j++)
			{
				d = t.charAt(j) - 64;
				a[d]++;
				b[d][a[d] - 1] = p.num;
			}
		}
		for (i = 1;i <= 26;i++)
		{
			for (j = 1,f = 0;j <= 26;j++)
			{
				if (a[i] < a[j])
				{
					f = 1;
					break;
				}
			}
			if (f == 0)
			{
				break;
			}
		}
		return i;
	}
	public static void Main()
	{
		stu head;
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		i = check(head, n);
		System.out.printf("%c\n%d\n",i + 64,a[i]);
		for (j = 0;j < a[i];j++)
		{
			System.out.printf("%d\n",b[i][j]);
		}

	}
}

