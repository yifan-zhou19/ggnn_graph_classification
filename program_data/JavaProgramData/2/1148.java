public class worker
{
	public int nm;
	public String name1 = new String(new char[26]);
	public worker next;
}
public class zuozhe
{
	public char nam;
	public int counts;
	public int[] name = new int[1000];
	public zuozhe next;
}

package <missing>;

public class GlobalMembers
{
	public static worker creat1(int n)
	{
		worker head;
		worker p1;
		worker p2;
		int i;
		head = new worker();
		p1 = p2 = head;
		for (i = 0;i < n;i++)
		{
			p2 = p1;
			p1 = new worker();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p2.nm = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p2.name1 = tempVar2.charAt(0);
			}
			p2.next = p1;
		}
		p2.next = null;
		return head;
	}
	public static zuozhe creat2()
	{
		zuozhe head;
		zuozhe p1;
		zuozhe p2;
		int i;
		head = new zuozhe();
		p1 = p2 = head;
		for (i = 0;i < 26;i++)
		{
			p2 = p1;
			p1 = new zuozhe();
			p2.counts = 0;
			p2.nam = 'A' + i;
			p2.next = p1;
		}
		p2.next = null;
		return head;
	}
	public static void Main()
	{
		int big = 0;
		char zz;
		int i;
		int j;
		char c;
		int m;
		int n;
		int[] a = new int[26];
		worker head1;
		worker p1;
		worker p2;
		zuozhe head2;
		zuozhe q1;
		zuozhe q2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head1 = creat1(n);
		p1 = p2 = head1;
		head2 = creat2();
		q1 = q2 = head2;
		while (p1 != 0)
		{
			i = 0;
			while (p1.name1.charAt(i) != '\0')
			{
				q1 = head2;
				while (true)
				{
					if (q1.nam == p1.name1.charAt(i))
					{
						q1.name[q1.counts] = p1.nm;
						q1.counts++;
						i++;
						break;
					}
					q1 = q1.next;
				}
			}
			p1 = p1.next;
		}
		q1 = head2;
		while (q1 != 0)
		{
			if (q1.counts > big)
			{
				zz = q1.nam;
				big = q1.counts;
			}
			q1 = q1.next;
		}
		q1 = head2;
		while (true)
		{
			if (q1.nam == zz)
			{
				System.out.printf("%c\n%d\n",q1.nam,q1.counts);
				for (i = 0;i < q1.counts;i++)
				{
					System.out.printf("%d\n",q1.name[i]);
				}
				break;
			}
			q1 = q1.next;
		}
	}



}

