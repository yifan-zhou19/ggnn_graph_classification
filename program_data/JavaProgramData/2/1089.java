public class student
{
	public int num;
	public String str = new String(new char[27]);
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat(int m)
	{
		student head;
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.str = tempVar2.charAt(0);
		}
		head = null;
		while (p1.num != 0)
		{
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
			p1 = (student)malloc(LEN);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.str = tempVar4.charAt(0);
			}
		}
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		student head;
		student p;
		student stu = new student();
		int m;
		int i;
		int t;
		int max;
		int y = 1;
		int[] a = new int[100];
		int[] sum = new int[27];
		char x = 1;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = creat(m);
		p = head;
		for (;p != 0;p = p.next)
		{
			for (t = 0;t < p.str.length();t++)
			{
				c = p.str.charAt(t);
				sum[c - 64]++;
			}
		}
		max = sum[1];
		for (i = 1;i <= 26;i++)
		{
			if (sum[i] > max)
			{
			max = sum[i];
			x = i;
			}
		}
			for (p = head;p != 0;p = p.next)
			{
				for (t = 0;t <= p.str.length();t++)
				{
					if (p.str.charAt(t) == x + 64)
					{
						a[y] = p.num;
					}
				}
					y++;
			}
			System.out.printf("%c\n%d\n",x + 64,max);
			for (y = 1;y <= 99;y++)
			{
				if (a[y] != 0)
				{
					System.out.printf("%d\n",a[y]);
				}
			}
	}


}

