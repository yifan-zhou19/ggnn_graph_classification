public class hou
{
	public int k;
public hou next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int k;
		int n;
		int m;
	hou head;
	hou p1;
	hou p2;

	while (true)
	{
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
			if (n == 0 && m == 0)
			{
			break;
			}
			head = new hou();
	p1 = head;
			for (i = 1;i <= n;i++)
			{
				if (i == n)
				{
				p1.k = n;
				p1.next = head;
				}
			else
			{
				p2 = p1;
			p1 = new hou();
			p2.k = i;
			p2.next = p1;
			}
			}
			p1 = head;
			p2 = head;
			for (i = 1;i <= n - 1;i++)
			{
							   for (j = 1;j <= m - 1;j++)
							   {
								   p2 = p1;
							   p1 = p1.next;
							   }
							   p2.next = p1.next;
							   p1 = p1.next;
			}
			System.out.printf("%d\n",p1.k);
	}

	}

}

