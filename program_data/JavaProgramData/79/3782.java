public class king
{
	public int num;
	public king next;
}

package <missing>;

public class GlobalMembers
{
	public static void p_king(int n,int m)
	{
		int i;
		king p1;
		king p2;
		king p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p = (king)malloc(LEN);
		for (i = 0;i < n;i++)
		{
			p1.num = i + 1;
			if (i == n - 1)
			{
				p1.next = p;
			}
			else
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1.next = (king)malloc(LEN);
			}
			p2 = p1,p1 = p1.next;
		}
		for (p1 = p;n != 1;n--)
		{
			for (i = 1;i < (m - 1) % n + 1;i++)
			{
				p2 = p1,p1 = p1.next;
			}
			p2.next = p1 = p1.next;
		}
		System.out.printf("%d\n",p1.num);
	}

	public static void Main()
	{
		int i;
		int[] n = new int[300];
		int[] m = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;m[i - 1] && n[i - 1] != 0;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;m[i] && n[i] != 0;i++)
		{
			p_king(n[i], m[i]);
		}
	}
}

