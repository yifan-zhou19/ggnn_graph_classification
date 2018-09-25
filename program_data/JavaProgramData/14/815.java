public class student
{
	public int num;
	public int yuwen;
	public int math;
	public int total;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		m = 0;
		head = null;
		while (m < n)
		{
		m = m + 1;
		p1 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.yuwen = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.math = Integer.parseInt(tempVar3);
		}
		p1.total = p1.yuwen + p1.math;
		if (m == 1)
		{
			head = p1;
			p2 = p1;
		}
		else
		{
			p2.next = p1;
		}
		p2 = p1;
		}
		p2.next = null;
		return (head);
	}

	public static void Main()
	{
		student head;
		student p;
		student px;
		int[][] a = new int[3][2];
		int t1;
		int t2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat();
		p = head;
		a[0][1] = a[1][1] = a[2][1] = 0;
		if (head != 0)
		{
		do
		{
			if (p.total > a[2][1])
			{
				a[2][1] = p.total;
				a[2][0] = p.num;
			}
			if (a[2][1] > a[1][1])
			{
				t1 = a[1][1];
				a[1][1] = a[2][1];
				a[2][1] = t1;
				t2 = a[1][0];
				a[1][0] = a[2][0];
				a[2][0] = t2;
			}
			if (a[1][1] > a[0][1])
			{
				t1 = a[0][1];
				a[0][1] = a[1][1];
				a[1][1] = t1;
				t2 = a[0][0];
				a[0][0] = a[1][0];
				a[1][0] = t2;
			}
			p = p.next;
		} while (p != 0);
		}
		for (t1 = 0;t1 <= 2;t1++)
		{
			System.out.printf("%d %d\n",a[t1][0],a[t1][1]);
		}

	}
}

