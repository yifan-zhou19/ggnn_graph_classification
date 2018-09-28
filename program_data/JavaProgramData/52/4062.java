public class num
	{
		public int a;
		public num next;
	}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		num head;
		num p1;
		num p2;
		int n;
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		p1 = new num();
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.a = Integer.parseInt(tempVar3);
		}
		head = p1;
		p2 = head;
		for (i = 1;i < n;i++)
		{
			p1 = new num();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.a = Integer.parseInt(tempVar4);
			}
			p2.next = p1;
			p2 = p2.next;
		}
		p1.next = head;
		for (i = 0;i <= n - m;i++)
		{
			p2 = p2.next;
		}
		for (i = 1;i < n;i++)
		{
			System.out.printf("%d ",p2.a);
			p2 = p2.next;
		}
		System.out.printf("%d",p2.a);
	}


}

