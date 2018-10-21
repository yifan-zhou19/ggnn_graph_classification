//??????????...?????????--by ??? 2011.11.10
public class stu
{
	public int num;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int tiren(int x, int n, int m, stu p) //???? x?????
	{
		int i;
		stu pp;
		if (x != n)
		{
			for (i = 1;i <= m - 1;i++)
			{
			p = p.next;
			}
			pp = p.next;
			p.next = pp.next;
			tiren(x + 1, n, m, p);
		}
		else
		{
		System.out.printf("%d\n",p.num);
		}
		return 0;
	}


	public static int Main()
	{
		int n;
		int m;
		int i;
		stu head;
		stu p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while ((n != 0))
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p = (stu)malloc(L);
		for (i = 2;i <= n;i++)
		{
			p.num = i - 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = p.next = (stu)malloc(L);

		}
		p.next = head;
		p.num = n;
		tiren(1, n, m, p);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			m = Integer.parseInt(tempVar4);
		}
		}

	}

}

