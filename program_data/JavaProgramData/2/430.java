public class shu
{
	public int num;
	public String a = new String(new char[26]);
	public shu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char ma = 'A';
		shu p1;
		shu p2;
		shu head;
		shu p;
		int[] cnt = new int[128];
		int i;
		int j;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (shu)malloc(l);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.a = tempVar3.charAt(0);
		}
		m = p1.a.length();
		for (j = 0;j < m;j++)
		{
			if (++cnt[p1.a.charAt(j)] > cnt[ma])
			{
				ma = p1.a.charAt(j);
			}
		}
		head = null;
		for (i = 1;i < n;i++)
		{
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (shu)malloc(l);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.a = tempVar5.charAt(0);
			}
			m = p1.a.length();
			for (j = 0;j < m;j++)
			{
				if (++cnt[p1.a.charAt(j)] > cnt[ma])
				{
					ma = p1.a.charAt(j);
				}
			}
		}
		p2.next = p1;
		p2 = p1;
		p2.next = null;
		p = head;
		System.out.printf("%c\n%d\n",ma,cnt[ma]);
		while (p != null)
		{
			m = p.a.length();
			for (i = 0;i < m;i++)
			{
				if (p.a.charAt(i) == ma)
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

