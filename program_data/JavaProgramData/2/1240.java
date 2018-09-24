public class book
{
	public int num;
	public String auth = new String(new char[26]);
	public book next;
}

package <missing>;

public class GlobalMembers
{
	public static book creat(int m)
	{
		int i = 0;
		book head;
		book p1;
		book p2;
		if (i == 0)
		{
			p1 = new book();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.auth = tempVar2.charAt(0);
			}
			head = p1;
			p2 = p1;
			p1.next = null;
			i++;
		}
		while (i < m)
		{
			p1 = new book();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.num = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.auth = tempVar4.charAt(0);
			}
			p2.next = p1;
			p1.next = null;
			p2 = p1;
			i++;
		}
		return (head);
	}

	public static int Main()
	{
		int m;
		int i;
		int lenth;
		int max = 0;
		int maxwh = 27;
		int[] count = new int[26];
		book head;
		book p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = creat(m);
		p = head;
		while (p != null)
		{
			lenth = p.auth.length();
			for (i = 0;i < lenth;i++)
			{
				count[(int)(p.auth)[i] - 65]++;
			}
			p = p.next;
		}
		for (i = 0;i < 26;i++)
		{
			if (count[i] > max)
			{
				max = count[i];
				maxwh = i;
			}
		}
		System.out.printf("%c\n",maxwh + 65);
		System.out.printf("%d\n",max);
		p = head;
		while (p != null)
		{
			lenth = p.auth.length();
			for (i = 0;i < lenth;i++)
			{
				if ((int)(p.auth.charAt(i)) == maxwh + 65)
				{
					System.out.printf("%d\n",p.num);
					break;
				}
			}
			p = p.next;
		}
		return 0;
	}


}

